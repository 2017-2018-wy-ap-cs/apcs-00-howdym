public class VeryCold extends PrecipitationDay { 
  private int chance = 0; 
  private int probability = 0;
  
  public VeryCold(int x) { 
    super(x); 
    chance = x; 
  } 
  
  @Override 
  public void forecast() { 
    System.out.println("Cloudy, " + chance + "% chance of snow"); 
  } 
  
  @Override
  public void actual() { 
    if (probability <= chance) { 
      System.out.println("Snowy"); 
    } else { 
      System.out.println("Cloudy"); 
    } 
  } 
  
}