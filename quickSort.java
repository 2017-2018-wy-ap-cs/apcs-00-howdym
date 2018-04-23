import java.util.*; 

public class quickSort { 
  public ArrayList<Integer> n = new ArrayList<Integer>();
  public ArrayList<Integer> z = new ArrayList<Integer>();
  public quickSort() { 
    n.add(2); 
    n.add(3); 
    n.add(-1); 
    n.add(55); 
    n.add(14); 
    n.add(-21); 
    n.add(21);
    z.add(21);
    z.add(-21); 
    z.add(14); 
    z.add(-1); 
    z.add(3); 
    z.add(2);
  } 
  
  public ArrayList<Integer> adder(ArrayList<Integer> a, Integer b, ArrayList<Integer> c) { 
    a.add(b); 
    for (int i = 0; i < c.size(); i++) { 
      a.add(c.get(i)); 
    } 
    return a; 
  }
  
  public ArrayList<Integer> qSort(ArrayList<Integer> a) { 
    if (a.size() == 0) { 
      return a; 
    }
    int pivot = a.size() / 2; 
    int y = a.get(pivot); 
    for (int i = 0; i < a.size(); i++) {  
      int x = a.get(i); 
      if (x > y) { 
        a.remove(i); 
        a.add(a.size(), x); 
        if (i < pivot) { 
          pivot = pivot - 1; 
          i = i - 1;
        }
      } else if (x < y) { 
        a.remove(i); 
        a.add(0, x); 
        if (i > pivot) { 
          pivot++; 
        }
      } 
    } 
    ArrayList<Integer> beginning = new ArrayList<Integer>();
    ArrayList<Integer> end = new ArrayList<Integer>();
    if (a.size() >= 2) {
      for (int i = 0; i < pivot; i++) { 
        beginning.add(a.get(i)); 
      } 
      for (int i = pivot + 1; i < a.size(); i++) { 
        end.add(a.get(i)); 
      }
      return adder(qSort(beginning), a.get(pivot), qSort(end)); 
    } else { 
      return a;
    } 
  } 
  
}