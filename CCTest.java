import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class CCTest { 
  CC m = new CC(1, 2); 
  CC n = new CC(1, 3); 
  CC o = new CC(1, 1); 
  CC p = new CC(2, 1); 
  CC q = new CC(-1, 4); 
  
  public CCTest() { 
    // do nothing 
  }

  public void CCTest() { 
    assertEquals(m.compareTo(n), -1); 
    assertEquals(m.compareTo(o), 1); 
    assertEquals(m.compareTo(m), 0); 
    assertEquals(m.compareTo(p), -1); 
    assertEquals(m.compareTo(q), 2); 
  }
} 


  