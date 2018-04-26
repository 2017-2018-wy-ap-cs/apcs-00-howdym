import java.util.*; 
import java.io.*; 

public class Tree { 
  public Tree() { 
    // do nothing 
  } 
  
  public static ArrayList<File> reorder(File[] x) throws Exception { 
    ArrayList<File> a = new ArrayList<File>();
    for (File b : x) { 
      if (b.isDirectory()) { 
        a.add(b); 
      } else { 
        a.add(0, b); 
      } 
    } 
    return a; 
  }
  
  public static void makeTree1(File f, String tab) throws Exception { 
    File[] contents;
    if (f.isDirectory()) { 
      contents = f.listFiles(); 
      ArrayList<File> reordered = reorder(contents);
      for (File x : reordered) { 
        if (x.isDirectory()) {
          System.out.println(tab + "└──" + x.getName());
          String updater = tab + "   ";
          makeTree1(x, updater); 
        } else {
          System.out.println(tab + "└──" + x.getName()); 
        }
      }
      //System.out.println(contents.toString());
    } 
  } 
  
  public static void makeTree(File f) throws Exception { 
    System.out.println(".");
    makeTree1(f, ""); 
  }
  
  public static void main(String[] args) throws Exception { 
    //File f = new File("."); 
    File l = new File("../../Documents"); 
    //makeTree(f); 
    makeTree(l);
  } 
}