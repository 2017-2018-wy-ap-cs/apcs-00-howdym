public class Banana extends Fruit { 
  private int length = 0;
  private int calcCal = 0;
  
  public Banana() { 
    super(120,4.8); 
    length = 8; 
  } 
  
  public Banana(int l) { 
    super((120/8 * l), 4.8); 
    length = l; 
  } 
  
}