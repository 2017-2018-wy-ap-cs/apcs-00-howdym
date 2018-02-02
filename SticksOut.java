import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

// You can put all of your tests in one class.
public class SticksOut {
  public static String[] case1(String[] xs) { 
    if (xs.length < 3) { 
      return xs; 
    } 
    String[] a = new String[xs.length]; 
    a[0] = xs[0]; 
    for (int n = 0; n <= xs.length - 3; n++) { 
      String pivot = xs[n + 1].toLowerCase(); 
      String compare = xs[n + 2].toLowerCase(); 
      if (pivot.compareTo(compare) > 0) { 
        a[n + 1] = xs[n + 2].substring((compare.length() + 1) / 2); 
      } else { 
        a[n + 1] = xs[n + 1]; 
      }
    }
    a[xs.length - 1] = xs[xs.length - 1];
    return a;
  }
  
  public static String[] case2(String[] xs) { 
    if (xs.length <= 2) { 
      return xs; 
    } 
    String[] a = new String[xs.length]; 
    a[0] = xs[0]; 
    for (int n = 1; n <= xs.length - 2; n++) { 
      int pivLength = xs[n].length(); 
      int compLength = xs[n - 1].length(); 
      if (compLength - pivLength >= 2) { 
        String nextLetter = xs[n + 1]; 
        a[n] = nextLetter.substring((nextLetter.length() + 1) / 2); 
      } else { 
        a[n] = xs[n]; 
      } 
    } 
    a[xs.length - 1] = xs[xs.length - 1]; 
    return a; 
  }
      
      
    public static String[] sticksOut(String[] xs)
    {
      String[] step1 = case1(xs); 
      String[] step2 = case2(step1); 
      return step2;
    }

    @Test
    public void test_trivial() {
        String[] xs = { };
        String[] answer = sticksOut(xs);
        assertArrayEquals(xs,answer);
        assertEquals(0, xs.length);
    }
    @Test
    public void test_one() {
        String[] xs = { "a" };
        String[] answer = sticksOut(xs);
        assertArrayEquals(xs,answer);
        assertEquals(1, xs.length);
        xs[0] = "b";
        assertFalse(xs[0].equals(answer[0]));
    }
    
    @Test 
    public void three_additional_tests() { 
      String[] a = {"alfa","bravo","zulu","charlie"}; 
      String[] b = {"walnut","pie","quince"};
      String[] c = {"DELTA","eragon","FOXTROT","FOXTRO"}; 
      String[] d = {"walnut","ziggy","quince"};
      String[] e = {"walnut","ziggy","quidie", "soup"};
      String[] f = {"walnut","ziggy","tutcker", "soup"};
      String[] ansA = {"alfa","bravo","lie","charlie"};
      String[] ansB = {"walnut","nce","quince"};
      String[] ansC = {"DELTA","eragon","TRO","FOXTRO"}; 
      String[] ansE = {"walnut","die","quidie", "soup"}; 
      String[] ansF = {"walnut","ker","up", "soup"};
      assertArrayEquals(sticksOut(a),ansA);
      assertArrayEquals(sticksOut(b),ansB);
      assertArrayEquals(sticksOut(c),ansC); 
      assertArrayEquals(sticksOut(d),ansB); 
      assertArrayEquals(sticksOut(e),ansE); 
      assertArrayEquals(sticksOut(f),ansF);
    }

    public static void main (String[] args)
    {
        org.junit.runner.JUnitCore.main("SticksOut");
    }
}