import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class insSortTest { 
  insSort m = new insSort(); 
  
  public static ArrayList<Integer> makeB(int q) {
    if (q == 0) { 
      ArrayList<Integer> a1 = new ArrayList<Integer>(); 
      a1.add(1); 
      a1.add(2); 
      a1.add(4); 
      a1.add(5); 
      a1.add(7); 
      a1.add(8);  
      return a1;
    } else if (q == 1) { 
      ArrayList<Integer> a1 = new ArrayList<Integer>(); 
      a1.add(2); 
      return a1;
    } else if (q == 2) { 
      ArrayList<Integer> a1 = new ArrayList<Integer>(); 
      a1.add(2); 
      a1.add(3);
      return a1;
    } else { 
      ArrayList<Integer> a1 = new ArrayList<Integer>(); 
      a1.add(1); 
      a1.add(5); 
      a1.add(64); 
      a1.add(98);
      a1.add(245);
      a1.add(542); 
      a1.add(683); 
      a1.add(778); 
      return a1;
    } 
  }
  
  public void doStuff() {
    m.iSort(m.w); 
    m.iSort(m.x); 
    m.iSort(m.y); 
    m.iSort(m.z); 
  }
   
  
  ArrayList<Integer> a = makeB(0); 
  ArrayList<Integer> b = makeB(1); 
  ArrayList<Integer> c = makeB(2); 
  ArrayList<Integer> d = makeB(3); 
  
  @Test 
  public void test1() {
    doStuff();
    assertEquals(m.w, a); 
    assertEquals(m.x, b);
    assertEquals(m.y, c); 
    assertEquals(m.z, d);
  }
}