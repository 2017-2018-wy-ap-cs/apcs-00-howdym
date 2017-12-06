public class Smoothie { 
  private Fruit fruit1 = null; 
  private Fruit fruit2 = null;
  
  public Smoothie(Fruit a, Fruit b) { 
    fruit1 = a; 
    fruit2 = b; 
  } 
  
  public int getCalories() { 
    return fruit1.getCalories() + fruit2.getCalories(); 
  }
  
}