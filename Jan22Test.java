import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Jan22Test { 
  Jan22 x = new Jan22();
  
  @Test 
  public void test_rotate() { 
    int[] a = {3,4,5,6}; 
    int[] b = x.rotateLeft(a); 
    int[] d = {4,5,6,3}; 
    assertArrayEquals(b, d);
    int[] c = x.rotateRight(a); 
    int[] e = {6,3,4,5}; 
    assertArrayEquals(c, e);
    assertArrayEquals(x.rotate(a, -3), e); 
    int[] h = {5,6,3,4}; 
    assertArrayEquals(x.rotate(a, 2), h); 
    assertArrayEquals(x.rotate(a,0), a);
  }
  
  @Test
  public void test_add_1() {
    int[] a = {9,2,3};
    int[] b = {9,4};
    int[] ans = {1,0,1,7};
    assertArrayEquals(ans, x.addUp(a,b));
  }
  
  @Test
  public void test_largest_average() {
    int[] data = {100,40,90,30};
    assertEquals(95, x.largestAverage(data), 0.1);

    int[] fdata = {-1000,-30,-31,-80};
    assertEquals(-30.5, x.largestAverage(fdata), 0.1);
}
}