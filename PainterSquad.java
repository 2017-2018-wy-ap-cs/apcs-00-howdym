public class PainterSquad extends BasicPainter { 
  private int color = 0; 
  private BasicPainter a,b,c; 
  
  public PainterSquad() { 
    super(); 
    a = new BasicPainter(); 
    b = new BasicPainter(); 
    c = new BasicPainter(); 
  } 
  
  @Override 
  public void paint() { 
    super.paint(); 
    a.paint(); 
    b.paint(); 
    c.paint(); 
  } 
}