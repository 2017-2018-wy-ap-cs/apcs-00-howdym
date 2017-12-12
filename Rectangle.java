public class Rectangle implements Shape2D { 
  private int width = 0; 
  private int length = 0; 
  
  public Rectangle(int w, int l) { 
    width = w; 
    length = l; 
  } 
  
  public int getArea() { 
    return width * length; 
  } 

}