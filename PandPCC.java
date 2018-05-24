import java.util.*; 

public class PandPCC implements Comparable<PandPCC> { 
  private String x; 
  private int y; 
  
  public PandPCC(String a, int b) { 
    x = a; 
    y = b; 
  } 
  
  public String toString() { 
    return x + " " + y; 
  }
  
  public int compareTo(PandPCC c) { 
    PandPCC z = (PandPCC) c;
    if (y != z.y) { 
      return -(y - z.y); 
    } else { 
      return -(x.compareTo(z.x)); 
    }
  } 
}