import java.util.*; 

public class Feb8Quiz { 
  public ArrayList<String> ace = new ArrayList<String>();
  
  public ArrayList<String> makeList(int x) { 
    ArrayList<String> result = new ArrayList<String>();
    if (x == 0) { 
      result.add("penguin"); 
    } else if (x == 1) { 
      result.add("Antartic"); 
      result.add("penguin"); 
    } else if (x == 2) { 
      result.add("penguin"); 
      result.add("penguin"); 
    } else { 
      result.add("penguin"); 
      result.add("habitat"); 
      result.add("happy"); 
      result.add("habitat"); 
      result.add("penguin"); 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("penguin"); 
      result.add("Antartic"); 
      result.add("penguin"); 
    } 
    return result;
  }
  
  public Feb8Quiz(int x) { 
    ace = makeList(x);
  } 
  
  public ArrayList<String> makeAnswers(int x) { 
    ArrayList<String> result = new ArrayList<String>();
    if (x == 0) { 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
    } else if (x == 1) { 
      result.add("Antartic"); 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
    } else if (x == 2) { 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
    } else { 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
      result.add("happy"); 
      result.add("habitat"); 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
      result.add("Antartic"); 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat"); 
      result.add("Antartic"); 
      result.add("Antartic"); 
      result.add("penguin"); 
      result.add("habitat");  
    }
    return result;
  }
  
  public static void penguins(ArrayList<String> list) { 
    for (int i = 0; i < list.size(); i++) { 
      if (list.size() == 1 && list.get(0).equals("penguin")) { 
        list.add(0, "Antartic"); 
        list.add(list.size(), "habitat"); 
        break;
      } else if (list.size() == 1) { 
        break; 
      }
      if (i == 0 && list.get(i).equals("penguin")) { 
        list.add(0, "Antartic"); 
        i++;
        if (!list.get(i + 1).equals("habitat")) { 
          list.add(i + 1, "habitat"); 
        } 
      } else if (i == list.size() - 1 && list.get(i).equals("penguin")) { 
        list.add(i, "Antartic"); 
        i++; 
        list.add(i + 1, "habitat"); 
      } else if (list.get(i).equals("penguin")) { 
        if (!list.get(i + 1).equals("habitat")) { 
          list.add(i + 1, "habitat"); 
        } 
        list.add(i, "Antartic"); 
        i++; 
      }
    }
  } 
}