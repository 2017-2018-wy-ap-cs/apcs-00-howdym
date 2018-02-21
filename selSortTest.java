import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class selSortTest { 
  selSort m = new selSort(); 
  
  public static int[] makeB(int q) {
    if (q == 0) { 
      int[] a1 = new int[6]; 
      a1[0] = 1; 
      a1[1] = 2; 
      a1[2] = 4; 
      a1[3] = 5; 
      a1[4] = 7; 
      a1[5] = 8;  
      return a1;
    } else if (q == 1) { 
      int[] a1 = new int[1]; 
      a1[0] = 2; 
      return a1;
    } else if (q == 2) { 
      int[] a1 = new int[2]; 
      a1[0] = 2; 
      a1[1] = 3;
      return a1;
    } else { 
      int[] a1 = new int[8]; 
      a1[0] = 1; 
      a1[1] = 5; 
      a1[2] = 64; 
      a1[3] = 98;
      a1[4] = 245;
      a1[5] = 542; 
      a1[6] = 683; 
      a1[7] = 778; 
      return a1;
    } 
  }
  
  public void doStuff() {
    m.selectionSort(m.w); 
    m.selectionSort(m.x); 
    m.selectionSort(m.y); 
    m.selectionSort(m.z); 
  }
   
  
  int[] a = makeB(0); 
  int[] b = makeB(1); 
  int[] c = makeB(2); 
  int[] d = makeB(3); 
  
  @Test 
  public void test1() {
    doStuff();
    assertArrayEquals(m.w, a); 
    assertArrayEquals(m.x, b);
    assertArrayEquals(m.y, c); 
    assertArrayEquals(m.z, d);
  }
}