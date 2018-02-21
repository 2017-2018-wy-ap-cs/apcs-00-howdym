import java.util.*; 

public class mergSort { 
  public ArrayList<Integer> a = new ArrayList<Integer>();
  public ArrayList<Integer> w = new ArrayList<Integer>();
  public ArrayList<Integer> x = new ArrayList<Integer>();
  public ArrayList<Integer> y = new ArrayList<Integer>();
  public ArrayList<Integer> z = new ArrayList<Integer>();
    
  public mergSort() { 
    w.add(4); 
    w.add(8); 
    w.add(7); 
    w.add(2); 
    w.add(5); 
    w.add(1);
    x.add(2);  
    y.add(3); 
    y.add(2);
    z.add(98); 
    z.add(245); 
    z.add(64); 
    z.add(1); 
    z.add(542); 
    z.add(683); 
    z.add(778); 
    z.add(5);
    a.add(5); 
    a.add(10); 
    a.add(6); 
    a.add(4); 
    a.add(65); 
    a.add(-1); 
  } 
  
  public ArrayList<Integer> adder(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {  
    System.out.println("This is a");
    System.out.println(a.toString()); 
    System.out.println("This is b");
    System.out.println(b.toString()); 
    System.out.println("This is c");
    System.out.println(c.toString()); 
    if (a.size() == 0 && b.size() == 0) { 
      return c; 
    } 
    if (a.size() == 0) { 
      int y = b.get(0);
      c.add(c.size(), y); 
      b.remove(0); 
      return adder(a, b, c);
    } else if (b.size() == 0) { 
      int x = a.get(0);
      c.add(c.size(), x); 
      a.remove(0); 
      return adder(a, b, c); 
    } 
    int x = a.get(0); 
    int y = b.get(0);
    if (x > y) { 
      c.add(c.size(), y); 
      b.remove(0);
      return adder(a, b, c);
    } else if (x <= y) { 
      c.add(c.size(), x); 
      a.remove(0); 
      return adder(a, b, c);
    }
    return a; // this shouldn't happen
  } 
    
  public ArrayList<Integer> helper(ArrayList<Integer> a, ArrayList<Integer> b) { 
    ArrayList<Integer> x = new ArrayList<Integer>();
    if (a.size() >= 2 || b.size() >= 2) { 
      return adder(mSort(a), mSort(b), x); 
    } 
    return adder(a, b, x);
  } 
  
  public ArrayList<Integer> mSort(ArrayList<Integer> b) { 
    ArrayList<Integer> beginning = new ArrayList<Integer>();
    ArrayList<Integer> end = new ArrayList<Integer>();
    for (int i = 0; i < b.size()/2; i++) { 
      beginning.add(b.get(i)); 
    } 
    for (int i = b.size()/2; i < b.size(); i++) { 
      end.add(b.get(i)); 
    }
    System.out.println("This is the beginning");
    System.out.println(beginning.toString()); 
    System.out.println("This is the end");
    System.out.println(end.toString());
    return helper(beginning, end); 
  } 
  
  public void meSort(ArrayList<Integer> b, int c) { 
    if (c == 0) { 
      w = mSort(b); 
    } else if (c == 1) { 
      x = mSort(b); 
    } else if (c == 2) { 
      y = mSort(b); 
    } else if (c == 3) { 
      z = mSort(b); 
    } else { 
      a = mSort(b); 
    } 
  }
 
}