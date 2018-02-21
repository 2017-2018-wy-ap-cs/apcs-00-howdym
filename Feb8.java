import java.util.*; 

public class Feb8 { 
  public Feb8() { 
    // do nothing 
  } 
  
  public static boolean throddPig(ArrayList<String> list) { 
    int total = 0; 
    for (String i : list) { 
      if (i.equals("pig") || i.equals("pigs")) { 
        total++; 
      } 
    } 
    return total % 3 == 0; 
  }
}