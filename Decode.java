import java.util.*; 
import java.io.*;

public class Decode { 
  private Set<DecodeCC> frequentP; 
  private Map<String, Double> frequent;
  private double counter;
  
  public Decode(File f) throws Exception { 
    frequentP = new TreeSet<DecodeCC>(); 
    frequent = new HashMap<String, Double>();
    Scanner sc = new Scanner(f); 
    counter = 0.0;
    while (sc.hasNext()) { 
      String temp = cleanup(sc.next()); 
      for (int i = 0; i < temp.length(); i++) { 
        String temp2 = temp.substring(i, i+1); 
        if (frequent.containsKey(temp2)) { 
          frequent.put(temp2, frequent.get(temp2) + 1); 
        } else { 
          frequent.put(temp2, 1.0); 
        } 
      }
      counter++;
    } 
    System.err.println(counter);
    Set<String> a = frequent.keySet(); 
    for (String b : a) { 
      //frequent.put(b, frequent.get(b) / counter);
      DecodeCC p = new DecodeCC(b, frequent.get(b)); 
      frequentP.add(p); 
      //System.out.println(frequentP.toString());
    }
    /*for (DecodeCC x : frequentP) { 
      DecodeCC p = new DecodeCC(x.getS(), x.getX() / counter); 
      frequentP.add(p);
    }*/
  } 
  
  public static String cleanup(String in) { 
    String tmp = in.replaceAll("'-",""); 
    String out = tmp.replaceAll("[^a-zA-Z]", ""); 
    return out.toLowerCase();
  } 
  
  public Set<DecodeCC> getF() { 
    for (DecodeCC a : frequentP) { 
      a.divide(counter); 
    }
    return frequentP; 
  }
  
  public ArrayList<ZipString> strip(Decode x) { 
    ArrayList<String> one = new ArrayList<String>();
    ArrayList<String> two = new ArrayList<String>();
    ArrayList<ZipString> result = new ArrayList<ZipString>();
    for (DecodeCC a : x.getF()) { 
      two.add(a.getS()); 
    } 
    for (DecodeCC a : frequentP) { 
      one.add(a.getS()); 
    } 
    for (int i = 0; i < one.size(); i++) {
      result.add(new ZipString(one.get(i), two.get(i))); 
    } 
    return result; // create Zip class
  }
  
  public static void main(String[] args) throws Exception { 
    Decode x = new Decode(new File("PandP")); 
    System.out.println(x.getF().toString()); 
    Decode y = new Decode(new File("encrypted")); 
    System.out.println(y.getF().toString()); 
  }
  
}