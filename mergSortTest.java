import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class mergSortTest { 
  mergSort m = new mergSort(); 
  
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
    } else if (q == 3) { 
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
    } else { 
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      a1.add(-1); 
      a1.add(4); 
      a1.add(5); 
      a1.add(6); 
      a1.add(10); 
      a1.add(65); 
      return a1; 
    }
  }
  
  public void doStuff() {
    m.meSort(m.w, 0); 
    m.meSort(m.x, 1); 
    m.meSort(m.y, 2); 
    m.meSort(m.z, 3);  
    m.meSort(m.a, 4);
  }
   
  
  ArrayList<Integer> e = makeB(0); 
  ArrayList<Integer> b = makeB(1); 
  ArrayList<Integer> c = makeB(2); 
  ArrayList<Integer> d = makeB(3); 
  
  @Test 
  public void test1() {
    doStuff();
    assertEquals(m.w, e); 
    assertEquals(m.x, b);
    assertEquals(m.y, c); 
    assertEquals(m.z, d);
  }
}