import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Feb7 {
  public Feb7() { 
    // do nothing 
  } 
  
  public static ArrayList<String> makeShopItems() {
    ArrayList<String> shopItems = new ArrayList<String> ();
    shopItems.add("banana");
    shopItems.add("rice");
    shopItems.add("turkey");
    shopItems.add("banana");
    shopItems.add("black beans");
    return shopItems;
  }
 
  public static ArrayList<Integer> makeShopAmounts() {
    ArrayList<Integer> shopItems = new ArrayList<Integer> ();
    shopItems.add(4);
    shopItems.add(128);
    shopItems.add(2);
    shopItems.add(8);
    shopItems.add(5);
    return shopItems;
  }
 
  public static int amountTotal(ArrayList<String> itemlist, ArrayList<Integer> amounts, String theItem) { 
    int x = 0; 
    for (int i = 0; i < itemlist.size(); i++) { 
      if (itemlist.get(i).equals(theItem)) { 
        x += amounts.get(i); 
      } 
    } 
    return x; 
  }
  
  public void listEditor(ArrayList<String> items, ArrayList<Integer> amounts, String theItem, int cutoffAmount) { 
    for (int i = items.size() - 1; i >= 0; i--) { 
      if (items.get(i).equals(theItem) || amounts.get(i) < cutoffAmount) { 
        items.remove(i); 
        amounts.remove(i); 
      }
    } 
  } 

  
  public static void main (String[] args) throws java.lang.Exception {
    ArrayList<String> shopItems = makeShopItems();
    ArrayList<Integer> shopAmounts = makeShopAmounts();
    System.out.println(shopItems);
    System.out.println(shopAmounts); 
  }
}