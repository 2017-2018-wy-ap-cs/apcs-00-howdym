public class Coordinates { 
  private int x, y; 
  
  public Coordinates(int a, int b) { 
    x = a; 
    y = b;
  } 
  
  public int getX() { 
    return x; 
  } 
  
  public void changeX(int a) { 
    x = a; 
  } 
  
  public int getY() { 
    return y; 
  } 
  
  public void changeY(int a) { 
    y = a; 
  } 
  
  public String toString() { 
    return "(" + x + ", " + y + ")"; 
  }
  
}