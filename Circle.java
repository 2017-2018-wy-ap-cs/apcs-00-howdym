public class Circle implements Shape2D { 
  private double radius = 0.0; 
  
  public Circle(double r) { 
    radius = r; 
  }
  
  public int getArea() { 
    return (int)(Math.PI * radius * radius); 
  } 
  
}