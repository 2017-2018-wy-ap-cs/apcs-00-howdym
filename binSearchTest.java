import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class binSearchTest { 
  binSearch x = new binSearch(); 
  
  public ArrayList<String> makeA() {
    ArrayList<String> a1 = new ArrayList<String>(); 
    a1.add("alpha"); 
    a1.add("beta"); 
    a1.add("ceelo"); 
    a1.add("delta"); 
    a1.add("epsilon"); 
    a1.add("feida"); 
    a1.add("gamma");  
    return a1; 
  }
  
  public ArrayList<String> makeB() {
    ArrayList<String> b2 = new ArrayList<String>(); 
    b2.add("alpha"); 
    b2.add("beta"); 
    b2.add("ceelo"); 
    b2.add("delta"); 
    b2.add("epsilon"); 
    b2.add("feida"); 
    return b2; 
  }
  
  public ArrayList<String> makeC() {
    ArrayList<String> c3 = new ArrayList<String>(); 
    c3.add("alpha"); 
    c3.add("beta"); 
    return c3;
  } 
  
  public ArrayList<String> makeD() {
    ArrayList<String> d4 = new ArrayList<String>(); 
    d4.add("alpha"); 
    return d4;
  }
   
  ArrayList<String> a1 = makeA();
  ArrayList<String> b1 = makeB(); 
  ArrayList<String> c1 = makeC();
  ArrayList<String> d1 = makeD();
  
  public String toString() {
    return "A1: "+a1;
  }
  
  @Test 
  public void test1() {
    System.err.println("A1"+a1);
    assertEquals(6,x.binS(a1, "gamma", 0, 6));
    
    assertEquals(x.binS(a1, "delta", 0, a1.size() - 1), 3);
    assertEquals(x.binS(a1, "epsilon", 0, 6), 4); 
    assertEquals(x.binS(a1, "alpha", 0, a1.size() - 1), 0);
  }
  
  @Test 
  public void test2() {
    assertEquals(x.binS(b1, "beta", 0, b1.size() - 1), 1); 
    assertEquals(x.binS(b1, "epsilon", 0, b1.size() - 1), 4);
    assertEquals(x.binS(b1, "alpha", 0, b1.size() - 1), 0); 
    assertEquals(x.binS(b1, "feida", 0, b1.size() - 1), 5);
  }
  
  @Test 
  public void test3() {
    assertEquals(x.binS(c1, "alpha", 0, c1.size() - 1), 0); 
    assertEquals(x.binS(c1, "beta", 0, c1.size() - 1), 1); 
    assertEquals(x.binS(d1, "alpha", 0, d1.size() - 1), 0);
  }
}