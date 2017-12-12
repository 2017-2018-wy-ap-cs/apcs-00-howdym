public class BinaryPainter extends BasicPainter { 
  private int color = 0; 
  
  public BinaryPainter() { 
    super(); 
  }
  
  @Override 
  public void paint() { 
    if (color < 127) { 
      System.out.println(0); 
    } else { 
      System.out.println(255); 
    }
  }
}