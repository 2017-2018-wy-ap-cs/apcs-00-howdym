import java.util.*;

public class insSort { 
  public ArrayList<Integer> w = new ArrayList<Integer>();
  public ArrayList<Integer> x = new ArrayList<Integer>();
  public ArrayList<Integer> y = new ArrayList<Integer>();
  public ArrayList<Integer> z = new ArrayList<Integer>();
    
  public insSort() { 
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
  } 
  
  public void addStuff(ArrayList<Integer> x, int y, int pivot) { 
    x.add(y, x.get(pivot)); 
    x.remove(pivot + 1); 
  } 
  
  public void iSorta(ArrayList<Integer> x, int pivot) { 
    int i = 0;
    while (i != pivot && x.get(i) < x.get(pivot)) { 
      i++; 
    }  
    addStuff(x, i, pivot); 
    if (x.size() - 1 == pivot) { 
      // end code
    } else { 
      iSorta(x, pivot + 1); 
    }
  } 
  
  public void iSort(ArrayList<Integer> x) { 
    iSorta(x, 0); 
  }
}
    