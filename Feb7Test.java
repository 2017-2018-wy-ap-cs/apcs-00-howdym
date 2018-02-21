import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class Feb7Test { 
  Feb7 x = new Feb7(); 
  ArrayList<String> a = x.makeShopItems(); 
  ArrayList<Integer> b = x.makeShopAmounts(); 
  ArrayList<Integer> c = x.makeShopAmounts();
  
  @Test 
  public void test1() {
    assertEquals(x.amountTotal(a, b, "banana"), 12);
    assertEquals(x.amountTotal(a, b, "rice"), 128);
    assertEquals(x.amountTotal(a, b, "turkey"), 2);
    assertEquals(x.amountTotal(a, b, "black beans"), 5);
  }
     
  @Test 
  public void test2() { 
    ArrayList<String> shopItems = new ArrayList<String> ();
    shopItems.add("turkey");
    shopItems.add("rice");
    shopItems.add("banana");
    shopItems.add("banana");
    shopItems.add("black beans");
    
    ArrayList<String> shopItems2 = new ArrayList<String> ();
    shopItems2.add("black beans");
    shopItems2.add("rice");
    shopItems2.add("turkey");
    shopItems2.add("banana");
    shopItems2.add("black beans");
    
    x.listEditor(shopItems, b, "banana", 0); 
    x.listEditor(shopItems2, c, "black beans", 3); 
    
    ArrayList<String> shopItems3 = new ArrayList<String> ();
    shopItems3.add("turkey");
    shopItems3.add("rice");
    shopItems3.add("black beans");
    
    ArrayList<String> shopItems4 = new ArrayList<String> ();
    shopItems4.add("rice");
    shopItems4.add("banana");
    
    ArrayList<Integer> shopAmounts = new ArrayList<Integer> ();
    shopAmounts.add(4);
    shopAmounts.add(128);
    shopAmounts.add(5); 
    
    ArrayList<Integer> shopAmounts1 = new ArrayList<Integer> ();
    shopAmounts1.add(128);
    shopAmounts1.add(8); 
    
    assertArrayEquals(shopItems.toArray(), shopItems3.toArray());
    assertArrayEquals(shopItems2.toArray(), shopItems4.toArray()); 
    assertArrayEquals(shopAmounts.toArray(), b.toArray());
    assertArrayEquals(shopAmounts1.toArray(), c.toArray());
  }
}