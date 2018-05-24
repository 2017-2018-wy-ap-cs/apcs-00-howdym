import java.util.*; 
import java.io.*; 

public class CookieMonster { 
  private CookiePackage[][] a, b;
  private int[][] d;
  
  public CookieMonster() throws Exception { 
    File g = new File("cookieMaze"); 
    Scanner f = new Scanner(g);
    int x = f.nextInt(); 
    int y = f.nextInt();
    /*System.out.println(y);*/
    a = new CookiePackage[x][y]; 
    b = new CookiePackage[x][y];
    d = new int[x][y];
    for (int i = 0; i < x; i++) { 
      for (int j = 0; j < y; j++) { 
        int k = f.nextInt(); 
        System.out.println(k);
        d[i][j] = 4; 
        a[i][j] = new CookiePackage(new Coordinates(i,j), k);
      } 
    } 
  }
  
  public void checkRight(int i, int j) { 
    if (!(j + 1 >= a[1].length)) { 
      if (b[i][j+1] == null) { 
        b[i][j+1] = new CookiePackage(b[i][j].getCoordinates(), b[i][j].getInt() + a[i][j+1].getInt());
      } else if (b[i][j+1].getInt() < b[i][j].getInt() + a[i][j+1].getInt()) { 
        b[i][j+1] = new CookiePackage(b[i][j].getCoordinates(), b[i][j].getInt() + a[i][j+1].getInt());
      } 
    } 
  } 
  
  public void checkDown(int i, int j) { 
    if (!(i + 1 >= a.length)) { 
      if (b[i+1][j] == null) { 
        b[i+1][j] = new CookiePackage(b[i][j].getCoordinates(), b[i][j].getInt() + a[i+1][j].getInt());
      } else if (b[i+1][j].getInt() < b[i][j].getInt() + a[i+1][j].getInt()) { 
        b[i+1][j] = new CookiePackage(b[i][j].getCoordinates(), b[i][j].getInt() + a[i+1][j].getInt());
      } 
    } 
  } 
  
  public void makeFlood() { 
    for (int i = 0; i < a.length; i++) { 
      for (int j = 0; j < a[1].length; j++) { 
        if (i == 0 && j == 0) { 
          b[0][0] = a[0][0]; 
        } 
        checkRight(i, j); 
        checkDown(i,j); 
      } 
    } 
  }
  
  public static void main(String[] args) throws Exception { 
    CookieMonster c = new CookieMonster(); 
    c.makeFlood(); 
    System.out.println(Arrays.deepToString(c.d));
    System.out.println(Arrays.deepToString(c.a)); 
    //System.out.println(Arrays.deepToString(c.b)); 
  }
  
}
        