import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class Feb6Test { 
  Feb6 s = new Feb6("noyes"); 
  Feb6 t = new Feb6("noyes"); 
  Feb6 u = new Feb6("noyes"); 
  Feb6 v = new Feb6("noyes"); 
  Feb6 w = new Feb6("noyes"); 
  Feb6 x = new Feb6("aardvark"); 
  Feb6 y = new Feb6("piggy"); 
  Feb6 z = new Feb6("noyes"); 
  
  @Test 
  public void test1() { 
    ArrayList<String> exRes = new ArrayList<String>(); 
    exRes.add("avoid"); 
    exRes.add("aardvark"); 
    exRes.add("possum"); 
    exRes.add("stop"); 
    exRes.add("stop"); 
    exRes.add("possum"); 
    exRes.add("stop"); 
    exRes.add("avoid"); 
    exRes.add("aardvark"); 
    exRes.add("avoid"); 
    exRes.add("aardvark"); 
    exRes.add("stop"); 
    exRes.add("stop"); 
    exRes.add("avoid"); 
    exRes.add("aardvark"); 
    exRes.add("stop"); 
    exRes.add("avoid"); 
    exRes.add("aardvark");   
    x.avoidAardvarks(x.change);
    assertArrayEquals(exRes.toArray(), x.change.toArray());
  } 
  
  @Test
  public void test2() { 
    ArrayList<String> pigs = new ArrayList<String>(); 
    pigs.add("goat"); 
    pigs.add("cow"); 
    y.noPig(y.change); 
    assertArrayEquals(pigs.toArray(), y.change.toArray()); 
  } 
  
  @Test 
  public void test3() { 
    ArrayList<String> noyes = new ArrayList<String>(); 
    noyes.add("no"); 
    noyes.add("no"); 
    noyes.add("no"); 
    noyes.add("no"); 
    noyes.add("no"); 
    noyes.add("no"); 
    noyes.add("noyes"); 
    noyes.add("no"); 
    noyes.add("no"); 
    noyes.add("no"); 
    s.yesToNo(s.change, 8); 
    t.yesToNo(t.change, 10); 
    u.yesToNo(u.change, 12); 
    v.yesToNo(v.change, 13);
    assertArrayEquals(noyes.toArray(), s.change.toArray()); 
    assertArrayEquals(noyes.toArray(), t.change.toArray()); 
    assertArrayEquals(noyes.toArray(), u.change.toArray()); 
    noyes.set(6, "no");
    z.yesToNo(z.change, 1); 
    assertArrayEquals(noyes.toArray(), z.change.toArray());
    assertArrayEquals(noyes.toArray(), v.change.toArray());
  } 
}