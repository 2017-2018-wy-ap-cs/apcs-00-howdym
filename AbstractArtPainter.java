public class AbstractArtPainter implements Painter { 
  private int color = 0; 
  
  public AbstractArtPainter() { 
    color = 0; 
  } 
  
  public void paint() { 
    System.out.println(color); 
  } 
  
  public int getColor() { 
    return color; 
  } 
  
  public void setColor(int x) { 
    double randomDecimal = Math.random() * 100; 
    color = (int)(randomDecimal); 
  }
  
}