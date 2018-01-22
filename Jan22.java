import java.util.Arrays; 

public class Jan22 {
  private int[] test = new int[5];
  
  public Jan22() { 
    int[] x = {1,2,3,4,5}; 
    test = x;
  }
  
  public static int[] jam(int[] a, int[] b) { 
    int alen = a.length; 
    int blen = b.length; 
    int[] x = new int[alen]; 
    int counter = 0;
    for (int i = 0; i < alen; i++) { 
      if (i < alen - blen) { 
        x[i] = 0; 
      } else { 
        x[i] = b[counter]; 
        counter++; 
      } 
    } 
    return x;
  }
  
  public static int[] adjust(int[] x) { 
    int[] answer = new int[5]; 
    return answer; 
  }
  
  public static int[] addUp(int[] a, int[] b) { 
    int alen = a.length; 
    int blen = b.length; 
    int[] x = a; 
    int[] y = b; 
    int[] z = null;
    if (alen > blen) { 
      y = jam(a,b); 
      z = new int[alen];
    } else if (alen < blen) { 
      x = jam(b,a); 
      z = new int[blen];
    } 
    for (int i = 0; i < alen; i++) { 
      int sum = x[i] + y[i]; 
      z[i] = sum; 
    } 
    // add in adjust here 
    return z;
  }

}
