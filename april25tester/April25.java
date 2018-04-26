import java.util.*; 
import java.io.*;

public class April25 { 
  public April25() { 
    // do nothing 
  } 
  
  public static void testCases() throws Exception { 
    File a = new File("work"); 
    File b = new File("dwork"); 
    File c = new File("dwork1"); 
    File d = new File("workInt"); 
    File e = new File("workInt1"); 
    File f = new File("dworkInt1"); 
    File g = new File("dworkInt2"); 
    PrintWriter work = new PrintWriter(a); 
    PrintWriter dwork = new PrintWriter(b); 
    PrintWriter dwork1 = new PrintWriter(c);
    PrintWriter workInt = new PrintWriter(d); 
    PrintWriter workInt1 = new PrintWriter(e); 
    PrintWriter dworkInt1 = new PrintWriter(f); 
    PrintWriter dworkInt2 = new PrintWriter(g);
    for (int i = 0; i < 51; i++) { 
      if (i < 49) { 
        dwork.println("a"); 
      } 
      if (i < 50) { 
        dwork1.println("a"); 
      } 
      work.println("a"); 
    } 
    workInt.println("110"); 
    workInt1.println("9"); 
    workInt1.println("a"); 
    workInt1.println("A"); 
    dworkInt1.println("a"); 
    dworkInt1.println("9"); 
    dworkInt2.println("b"); 
    dworkInt2.println("b"); 
    dworkInt2.println("0"); 
    work.close();
    dwork.close(); 
    dwork1.close(); 
    workInt.close(); 
    workInt1.close(); 
    dworkInt1.close(); 
    dworkInt2.close(); 
  }
    
  public static ArrayList<File> parseFiles(File[] f) throws Exception { 
    ArrayList<File> result = new ArrayList<File>(); 
    for (File i : f) { 
      if (!(i.isDirectory())) {
        if (intOr50(i)) { 
          result.add(i); 
        } 
      } else { 
        System.err.println("File " + i.getName() + " isn't a directory."); 
      }
    } 
    return result;
  }
  
  public static boolean intOr50(File g) throws Exception { 
    Scanner f = new Scanner(g);
    int counter = 0;
    while (f.hasNextLine()) { 
      String line = f.nextLine(); 
      if (counter == 0) { 
        for (int i = 0; i < line.length(); i++) { 
          boolean isInteger = false;
          String chunk = line.substring(i, i+1); 
          for (int j = 0; j < 11; j++) { 
            String number = Integer.toString(j);
            isInteger = isInteger || (chunk.equals(number)); 
            if (isInteger) { 
              return true; 
            } 
          } 
        }
        counter++;
      } else {
        counter++; 
      }
    } 
    System.err.println(g.getName() + ": " + counter);
    if (counter > 50) { 
      return true; 
    } 
    return false; 
  } 
  
  public static void main(String[] args) throws Exception { 
    testCases();
    File f = new File("."); 
    if (f.isDirectory()) {
      File[] listF = f.listFiles(); 
      ArrayList<File> heh = parseFiles(listF); 
      for (File i : heh) { 
        System.out.println(i.getName()); 
      } 
    } else { 
      System.err.println("File " + f.getName() + " isn't a directory."); 
    } 
  }
  
}