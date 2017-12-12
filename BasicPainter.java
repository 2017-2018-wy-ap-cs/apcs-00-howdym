public class BasicPainter implements Painter { 
  private int color; 
  
  public BasicPainter() { 
    color = 0;
  } 
  
  public void paint() { 
    // do nothing 
  }
  
  public int getColor() { 
    return color; 
  } 
  
  public void setColor(int x) { 
    color = x; 
  } 
  
} 

