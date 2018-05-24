import java.util.*; 
import java.io.*; 

public class PandP { 
  public PandP() { 
    // do nothing 
  } 
  
  public static String cleanup(String in) { 
    String tmp = in.replaceAll("'-",""); 
    String out = tmp.replaceAll("[^a-zA-Z]", ""); 
    return out.toLowerCase(); 
  }
  
  public static void main(String[] args) throws Exception { 
    Scanner sc = new Scanner(new File("SandS"));
    Map<String, Integer> m = new HashMap<String, Integer>(); 
    
    while (sc.hasNext()) { 
      String s = sc.next(); 
      s = cleanup(s);
      if (!m.containsKey(s)) { 
        m.put(s, 1); 
      } else { 
        m.put(s, m.get(s) + 1); 
      } 
    } 
    
    Set<String> k = m.keySet();
    Set<PandPCC> printer = new TreeSet<PandPCC>(); 
    
    for (String d: k) { 
      PandPCC pp = new PandPCC(d, m.get(d)); 
      printer.add(pp);
    } 
    
    int counter = 0;
    
    for (PandPCC a: printer) { 
      System.out.println(a); 
      counter++; 
      if (counter >= 10) { 
        break; 
      } 
    }
    
  } 
  
}

