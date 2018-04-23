import java.util.*; 
import java.io.*; 

public class wheresWaldo { 
  
  public wheresWaldo() { 
    // do nothing
  }
  
  public static void tester(String oneline, int count) { 
    String current = oneline.substring(0,1);
    boolean theSame = true; 
    for (int i = 1; i < oneline.length(); i++) { 
      theSame = theSame && (current.equals(oneline.substring(i, i+1))); 
    } 
      
    if (theSame) { 
      System.out.println("Row " + count + " has repeating " + current + "s."); 
    } 
  }

  public static int findWaldo(File f) throws FileNotFoundException {
    Scanner s = new Scanner(f);
    int count = 0;
    int waldosFound = 0;
    
    while (s.hasNextLine()) {
      String oneline = s.nextLine();
      count += 1;
      
      String current = oneline.substring(0,1);
      boolean theSame = true;
      for (int i = 1; i < oneline.length(); i++) { 
        theSame = theSame && (current.equals(oneline.substring(i, i+1))); 
      } 
      
      if (theSame) { 
        System.out.println("Row " + count + " has repeating " + current + "s."); 
        waldosFound++;
      }
    }
    
    System.out.println(waldosFound + " Waldos found.");
    return count;
  }
  
  public static void main(String[] args) throws Exception {
    File f = new File("wheresWaldo.txt");
    PrintWriter output = new PrintWriter(f);
    
    for (int i = 0; i < 10000; i++) {
      int random = (int) (Math.random() * 1001); 
      if (random == 1) { 
        String line = "";
        String randStr = Integer.toString((int) (Math.random() * 10)); 
        for (int w = 0; w < 10; w++) { 
          line = randStr + line;
        }
        output.println(line); 
      } else { 
        String line = "";
        for (int w = 0; w < 10; w++) { 
          String randStr = Integer.toString((int) (Math.random() * 10)); 
          line = randStr + line;
        }
        output.println(line); 
      }
    }
    output.close(); 
    
    System.out.println("This file has " + findWaldo(f) + " lines.");
  }
  
}
