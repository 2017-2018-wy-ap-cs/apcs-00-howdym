public class BananaPainter extends Banana implements Painter { 
  private int color = 0; 
  private int length;
  
  public BananaPainter(int l) { 
    super(l); 
    length = l;
  } 
  
  public void paint() { 
    System.out.println(length); 
  } 
  
  public int getColor() { 
    return color; 
  } 
  
  public void setColor(int x) { 
    // do nothing 
  } 
  
}