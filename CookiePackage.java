import java.util.*; 

public class CookiePackage { 
  private Coordinates x; 
  private int y; 
  
  public CookiePackage(Coordinates a, int b) { 
    x = a; 
    y = b; 
  } 
  
  public Coordinates getCoordinates() { 
    return x; 
  } 
  
  public int getInt() { 
    return y;
  } 
  
  public void changeCoordinates(int x1, int x2) { 
    x = new Coordinates(x1, x2); 
  } 
  
  public void changeInt(int y) { 
    y = y; 
  } 
  
  public String toString() { 
    return "(" + x.getX() + ", " + x.getY() + ") " + y; 
  }
  
} 
