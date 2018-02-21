import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class Feb8Test { 
  Feb8 x = new Feb8(); 
  
  public ArrayList<String> makePigs() {
    ArrayList<String> onlyPigs = new ArrayList<String>();
    onlyPigs.add("pigs"); 
    onlyPigs.add("pugs"); 
    onlyPigs.add("pigs"); 
    onlyPigs.add("pigs"); 
    onlyPigs.add("Pocs"); 
    onlyPigs.add("pigs"); 
    return onlyPigs;
  }
  
  public ArrayList<String> makePig() {
    ArrayList<String> onlyPig = new ArrayList<String>(); 
    onlyPig.add("pig"); 
    onlyPig.add("pig"); 
    onlyPig.add("pork"); 
    onlyPig.add("puc"); 
    onlyPig.add("pig"); 
    return onlyPig;
  }
  
  public ArrayList<String> makeBoth() {
    ArrayList<String> both = new ArrayList<String>(); 
    both.add("pig"); 
    both.add("pugs"); 
    both.add("pigs"); 
    both.add("puc"); 
    both.add("pogs"); 
    both.add("pigs"); 
    both.add("pig"); 
    return both;
  } 
  
  ArrayList<String> onlyPigs = makePigs();
  ArrayList<String> onlyPig = makePig(); 
  ArrayList<String> both = makeBoth();
    
  @Test 
  public void test1() {
    assertEquals(x.throddPig(onlyPigs), false); 
    assertEquals(x.throddPig(onlyPig), true); 
    assertEquals(x.throddPig(both), false);
  }
}