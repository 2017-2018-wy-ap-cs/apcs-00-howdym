import java.util.*; 

public class Feb6 {
  public ArrayList<String> change = new ArrayList<String>(); 
  
  public Feb6(String type) { 
    if (type.equals("piggy")) { 
      change.add("pig"); 
      change.add("pig"); 
      change.add("goat"); 
      change.add("cow"); 
      change.add("pig"); 
    } else if (type.equals("aardvark")) {
      change.add("aardvark"); 
      change.add("wombat"); 
      change.add("stop"); 
      change.add("stop"); 
      change.add("wombat"); 
      change.add("stop"); 
      change.add("aardvark"); 
      change.add("aardvark"); 
      change.add("stop"); 
      change.add("stop"); 
      change.add("aardvark"); 
      change.add("stop"); 
      change.add("aardvark"); 
    } else if (type.equals("noyes")) { 
      change.add("yes"); 
      change.add("yes"); 
      change.add("no"); 
      change.add("yes"); 
      change.add("no"); 
      change.add("no"); 
      change.add("yes"); 
      change.add("no"); 
      change.add("yes"); 
      change.add("yes"); 
    }
  }
  
  public static void avoidAardvarks(ArrayList<String> data) { 
    for (int x = data.size() - 1; x >= 0; x--) { 
      if (data.get(x).equals("aardvark")) { 
        data.add(x, "avoid");  
      } else if (data.get(x).equals("wombat")) { 
        data.set(x, "possum"); 
      } 
    }
  } 
  
  public static void noPig(ArrayList<String> data) { 
    for (int x = data.size() - 1; x >= 0; x--) { 
      if (data.get(x).equals("pig")) { 
        data.remove(x); 
      } 
    } 
  }
  
  public static void yesToNo(ArrayList<String> theList, int craziness) { 
    int counter = 1;
    for (int x = 0; x < theList.size(); x++) { 
      if (craziness >= 8 && craziness <= 12 && counter == 4 && theList.get(x).equals("yes")) { 
        theList.set(x, "noyes"); 
        counter++;
      } else if (theList.get(x).equals("yes")) { 
        theList.set(x, "no"); 
        counter++; 
      } 
    } 
  }
}
