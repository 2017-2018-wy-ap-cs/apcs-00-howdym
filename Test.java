public class Test { 
  public Test() { 
    // do nothing 
  } 
  
  public int checkStar(String str, int num) { 
  for (int i = num; i < str.length(); i++) { 
    String x = str.substring(i, i+1); 
    if (!x.equals("*")) { 
      return i; 
    } 
  }
  return num; 
}

public String starOut(String str) {
  String result = str; 
  for (int i = 0; i < result.length(); i++) { 
    String x = result.substring(i, i+1); 
    if (x.equals("*")) { 
      if (i != 0) { 
        result = result.substring(0, i-1) 
               + result.substring(checkStar(result, i) + 1); 
        starOut(result); 
      } else { 
        result = result.substring(checkStar(result, i) + 1); 
        starOut(result); 
      } 
    } 
  }
  for (int i = 0; i < result.length(); i++) { 
    String x = result.substring(i, i+1); 
    if (x.equals("*")) { 
      if (i != 0) { 
        result = result.substring(0, i-1) 
               + result.substring(checkStar(result, i) + 1); 
        starOut(result); 
      } else { 
        result = result.substring(checkStar(result, i) + 1); 
        starOut(result); 
      } 
    } 
  } 
  return result;
}
public String plusOut(String str, String word) {
  int[] mess = []; 
  for (int i = 0; i < str.length() - 1; i++) { 
    x = str.substring(i, i + word.length()); 
    if (x.equals(word)) { 
      mess.push(i); 
      mess.push(i+1); 
    } 
  } 
  String result = "";
  for (int i = 0; i < str.length(); i++) { 
    if (i == mess[0]) { 
      result = result + "xy"; 
      mess = ArrayUtils.remove(mess, 0); 
      mess = ArrayUtils.remove(mess, 0);
    } else { 
      result = result + "+";
    }
  }
  return result;
}

}
