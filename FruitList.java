public class FruitList { 
  private String name = null;
  private Fruit fruit1 = null; 
  private Fruit fruit2 = null; 
  private Fruit fruit3 = null;
  
  public FruitList(String s) { 
    name = s; 
  } 
  
  public FruitList(String s, Fruit a, Fruit b, Fruit c) { 
    name = s; 
    fruit1 = a; 
    fruit2 = b; 
    fruit3 = c; 
  } 
  
  public Fruit addFruit(Fruit f) { 
    Fruit help = fruit3; 
    fruit3 = fruit2; 
    fruit2 = fruit1; 
    fruit1 = f; 
    return help; 
  } 
  
  public void print() { 
    System.out.println(name);
    System.out.println(fruit1);
    System.out.println(fruit2);
    System.out.println(fruit3);
  }
  
}