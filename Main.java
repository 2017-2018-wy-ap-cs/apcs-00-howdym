public class Main {
  public static void main (String[] args) {
 System.out.println("Testing isGoodNecklace");
 System.out.println("======================");
 iGNTest();
    
 System.out.println("Testing gnil");
 System.out.println("============");
 gnilTest();
    
 System.out.println("Testing altSum");
 System.out.println("==============");
 altSumTest();
  }
  public static void isGoodNecklace1(String s, boolean correct) {
 boolean ans = isGoodNecklace(s);
 String result = "Fail";
 if (correct == ans ) {
   result="Pass";
 }
 System.out.println("iGN("+s+") "+result);
  }
  public static void iGNTest() {
 isGoodNecklace1("clasp pendant pendant pendant clasp", false);
 isGoodNecklace1("clasp pendant pendant pendant pendant clasp", true);
 isGoodNecklace1("clasp pendant clasp pendant pendant clasp", false);
 isGoodNecklace1("pendant clasp pendant pendant pendant clasp", false);
 isGoodNecklace1("pendant clasp pendant pendant pendant clasp pendant clasp", true);
 isGoodNecklace1("claspendant pendant pendant clasp pendant ",true);
    
 String c = "clasp";
 String p = "pendant";
 isGoodNecklace1(p + c + c + c + c + p + c + p + c + p + c + p + c, true);
 isGoodNecklace1(p + c + c + c + c + p + c + p + c + p + c + p + c + p , true);
 isGoodNecklace1(c + c + c + c + p + c + p + c + p + c + p + c+p, true);
 isGoodNecklace1(c + c + c + c + p + c + p + c + p + c + p + c+p+p, true);
  }
  public static void gnil1(String a, String b, boolean correct)
  {
 boolean ans = gnil(a,b);
 String result = "Fail";
 if (correct == ans ) {
   result="Pass";
 }
 System.out.println("gnil("+a+","+b+") "+result);
  }
  public static void gnilTest() {
 gnil1("Bling", "Big gnilB",true);
 gnil1("Big", "BBig Guitar",true);
 gnil1("Tele", "TTele fone eleT", false);
 gnil1("good", "Good", false);
 gnil1("good", "good doog", false);
 gnil1("good", "goodoog", false);
  }
  public static void alt1(int s, int e, int correct) {
 int ans = altSum(s,e);
 String result = "Fail";
 if (correct == ans ) {
   result="Pass";
 }
 System.out.println("altSum("+s+","+e+") "+result);
  }
 
  public static void altSumTest() {
 alt1(50, 55, 50-53);
 alt1(50, 57, 50 - 53);
 alt1(50, 60, 50 - 53 + 59);
 alt1(51, 71, 51 - 54 + 57 - 60 + 66 - 69);
  }

  public static boolean isGoodNecklace (String s) {
    String x = s; 
    int pendantCounter = 0; 
    for (int i = 0; i < s.length(); i++) { 
      int n = x.indexOf("clasp"); 
      String z = x.substring(n + 5); 
      int y = z.indexOf("clasp") + 5; 
      int a = x.indexOf("pendant"); 
      int q = z.indexOf("clasp");
      if (q == -1) { 
        return pendantCounter % 2 == 0;
      }
      if (a < n) { 
        x = x.substring(a + 7); 
      } else if ((a > n + 5) && (a < y)) { 
        pendantCounter += 1; 
        x = x.substring(0,n+5) + x.substring(a + 7); 
      } else { 
        x = x.substring(y); 
      }      
    } 
    return false; 
  }
 
  public static boolean gnil (String a, String b) { 
    if (a.length() > b.length()) { 
      return false; 
    }
    String s = ""; 
    for (int x = 0; x < a.length(); x++) { 
      s = a.substring(x, x+1) + s; 
    } 
    int n = b.indexOf(s); 
    int d = b.indexOf(a); 
    return (((d == 1) || (d == 0)) && !(n == b.length() - a.length())) 
      || 
      (!((d == 1) || (d == 0)) && (n == b.length() - a.length()));
  }
  
  public static int altSum (int start, int end) {
    int result = 0; 
    boolean secondNumber = false; 
    for (int i = 0; i <= (end-start); i++) { 
      int a = start + 3 * i; 
      if (a > end) { 
        result += 0; 
      } else if (a % 7 == 0) { 
        result += 0; 
      } else if (!secondNumber) { 
        result += a; 
        secondNumber = true;
      } else if (secondNumber) { 
        result = result - a;
        secondNumber = false;
      } 
    }
    return result;
  }
  
}

