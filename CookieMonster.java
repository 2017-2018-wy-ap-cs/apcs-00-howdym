import java.util.*; 
import java.io.*; 

public class CookieMonster { 
  private CookiePackage[][] a, b;
  
  public CookieMonster() throws Exception { 
    File g = new File("cookieMaze2"); 
    Scanner f = new Scanner(g);
    int x = f.nextInt(); 
    int y = f.nextInt();
    a = new CookiePackage[x][y]; 
    b = new CookiePackage[x][y];
    for (int i = 0; i < x; i++) { 
      for (int j = 0; j < y; j++) { 
        int k = f.nextInt(); 
        a[i][j] = new CookiePackage(new Coordinates(i,j), k);
      } 
    } 
    System.out.println(Arrays.deepToString(a));
  }
  
  public void negFill() { 
    for (int i = 1; i < a.length; i++) { 
      for (int j = 1; j < a[0].length; j++) { 
        if (a[i-1][j].getInt() == -1 && a[i][j-1].getInt() == -1) { 
          a[i][j] = new CookiePackage(a[i][j].getCoordinates(), -1); 
        } 
      } 
    } 
  }
  
  public void checkRight(int i, int j) { 
    if (!(j + 1 >= a[1].length)) { 
      System.err.println("There");
      if (a[i][j].getInt() == -1 || a[i][j+1].getInt() == -1) { 
        // do nothing
      } else if (b[i][j+1] == null) { 
        b[i][j+1] = new CookiePackage(a[i][j].getCoordinates(), b[i][j].getInt() + a[i][j+1].getInt());
      } else if (b[i][j+1].getInt() < b[i][j].getInt() + a[i][j+1].getInt()) { 
        b[i][j+1] = new CookiePackage(a[i][j].getCoordinates(), b[i][j].getInt() + a[i][j+1].getInt());
      } 
    } 
  } 
  
  public void checkDown(int i, int j) { 
    if (!(i + 1 >= a.length)) {
      if ((a[i][j].getInt() == -1 || a[i+1][j].getInt() == -1) && b[i+1][j] == null) { 
        // do nothing 
      } else if (b[i+1][j] == null) { 
        b[i+1][j] = new CookiePackage(a[i][j].getCoordinates(), b[i][j].getInt() + a[i+1][j].getInt());
      } else if (b[i+1][j].getInt() < b[i][j].getInt() + a[i+1][j].getInt()) { 
        b[i+1][j] = new CookiePackage(a[i][j].getCoordinates(), b[i][j].getInt() + a[i+1][j].getInt());
      } 
    } 
  } 
  
  public void makeFlood() { 
    negFill();
    for (int i = 0; i < a.length; i++) { 
      for (int j = 0; j < a[1].length; j++) { 
        if (i == 0 && j == 0) { 
          b[0][0] = a[0][0]; 
        } 
        checkRight(i,j); 
        System.err.println("Here");
        checkDown(i,j); 
        System.out.println(Arrays.deepToString(b));
      } 
    } 
  }
  
  public void printFlood(CookiePackage[][] z) { 
    for (int i = 0; i < z.length; i++) { 
      String print = ""; 
      for (int j = 0; j < z[1].length; j++) { 
        print = print + " " + z[i][j]; 
      } 
      System.out.println(print); 
    } 
  }
  
  public ArrayList<Coordinates> traceBack() { 
    ArrayList<Coordinates> d = new ArrayList<Coordinates>();
    int y = b[0].length - 1; 
    int x = b.length - 1; 
    while (x != 0 || y != 0) { 
      d.add(0, new Coordinates(x, y)); 
      int temp = x;
      x = b[x][y].getCoordinates().getX(); 
      y = b[temp][y].getCoordinates().getY(); 
    } 
    d.add(0, new Coordinates(0,0));
    return d; 
  }
  
  public static void main(String[] args) throws Exception { 
    CookieMonster c = new CookieMonster(); 
    c.makeFlood(); 
    c.printFlood(c.a); 
    System.out.println("\n");
    c.printFlood(c.b); 
    System.out.println(c.traceBack());
  }
  
}
        