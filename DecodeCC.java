import java.util.*; 

public class DecodeCC implements Comparable<DecodeCC> { 
  private String s; 
  private double x; 
   
  public DecodeCC(String a, double b) { 
    s = a; 
    x = b; 
  } 
  
  public String getS() { 
    return s; 
  } 
  
  public double getX() { 
    return x; 
  } 
  
  public String toString() { 
    return s + ", " + x; 
  } 
  
  public int compareTo(DecodeCC d) { 
    if (x != d.x) { 
      return (int) -(x - d.x); 
    } else { 
      return -(s.compareTo(d.s)); 
    } 
  } 
  
  public void divide(double d) { 
    x = x / d; 
  }
  
} 
  