public class PrecipitationDay implements Weather { 
  private int chance = 0; 
  private int probability = 0;
  
  public PrecipitationDay(int x) { 
    chance = x; 
    probability = (int)(Math.random() * 100);
  } 
  
  public void forecast() { 
    System.out.println("Cloudy, " + chance + "% chance of rain"); 
  } 
  
  public void actual() { 
    if (probability <= chance) { 
      System.out.println("Rainy"); 
    } else { 
      System.out.println("Cloudy"); 
    } 
  } 

}