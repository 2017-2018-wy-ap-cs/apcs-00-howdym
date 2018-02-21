import java.util.*; 

public class CC implements Comparable<CC> { 
  private int x; 
  private int y; 
  
  public CC(int a, int b) { 
    x = a; 
    y = b; 
  } 
  
  public int compareTo(CC z) { 
    if (x != z.x) { 
      return x - z.x; 
    } else { 
      return y - z.y; 
    } 
  } 
}