import java.util.Arrays; 

public class Jan22 {
  private int[] test = new int[5];
  
  public Jan22() { 
    int[] x = {1,2,3,4,5}; 
    test = x;
  }
  
  public static int[] rotateLeft(int[] a) { 
    int[] result = new int[a.length]; 
    int pull = a[0];
    for (int i = 0; i < a.length - 1; i++) { 
      result[i] = a[i + 1]; 
    } 
    result[a.length - 1] = pull; 
    return result;
  } 
    
  public static int[] rotateRight(int[] a) { 
    int[] result = new int[a.length]; 
    int pull = a[a.length - 1]; 
    result[0] = pull; 
    for (int i = 0; i < a.length - 1; i++) { 
      result[i + 1] = a[i]; 
    } 
    return result; 
  }
    
  public static int[] rotate(int[] a, int amount) { 
    int[] x = a;
    if (amount > 0) { 
      for (int i = 0; i < amount; i++) { 
        x = rotateRight(x); 
      } 
    } else if (amount < 0) { 
      for (int i = 0; i < amount * -1; i++) { 
        x = rotateLeft(x); 
      } 
    } else { 
       return x;
    } 
    return x; 
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
    int[] answer = new int[x.length]; 
    boolean adder = false;
    for (int i = x.length - 1; i >= 0; i = i - 1) { 
      int a = 0;
      if (adder) { 
        a++; 
      } 
      if (x[i] >= 10) { 
        adder = true; 
        a = a + x[i] % 10; 
      } else { 
        adder = false; 
        a = a + x[i]; 
      } 
      answer[i] = a; 
    }
    if (adder) { 
      int[] inter = new int[x.length + 1]; 
      inter[0] = 1;
      for (int i = 0; i < x.length; i++) { 
        inter[i + 1] = answer[i]; 
      }
      return inter;
    } else { 
      return answer;
    }
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
    } else { 
      z = new int[alen];
    }
    for (int i = 0; i < alen; i++) { 
      int sum = x[i] + y[i]; 
      z[i] = sum; 
    } 
    z = adjust(z);
    return adjust(z);
  }

  public static int findMax(int[] a) { 
    int x = a[0]; 
    for (int i = 0; i < a.length; i++) { 
      if (a[i] > x) { 
        x = a[i]; 
      } 
    } 
    return x; 
  } 
  
  public static int[] cutOut(int[] a, int b) { 
    int[] x = a;
    int[] y = new int[a.length - 1];
    for (int i = 0; i < a.length; i++) { 
      if (x[0] != b) { 
        x = rotateLeft(x); 
      } 
    } 
    for (int i = 0; i < a.length - 1; i++) { 
      y[i] = x[i + 1]; 
    }
    return y;
  }
  
  public static double largestAverage(int[] data) { 
    int a = findMax(data); 
    int[] b = cutOut(data, a); 
    int c = findMax(b); 
    double d = a; 
    double e = c; 
    return (d + e) / 2; 
  } 
}
