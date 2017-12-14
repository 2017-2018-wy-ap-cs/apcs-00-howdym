public class Classwork { 
  public Classwork() { 
    // do nothing 
  } 
  
  public String removeDashes(String y) { 
    return y.substring(0, 3) + y.substring(5, 6) + y.substring(7); 
  } 
  
  public String dateStr(String y) { 
    int slash1 = y.indexOf("/"); 
    int slash2 = y.indexOf("/", slash1 + 1); 
    String month = y.substring(0, slash1); 
    String date = y.substring(slash1 + 1, slash2); 
    String year = y.substring(slash2 + 1); 
    if (month.length() != 2) { 
      month = "0" + month; 
    } 
    if (date.length() != 2) { 
      date = "0" + date; 
    }
    return date + "-" + month + "-" + year; 
  } 
  
  String ccNumber = "4111 1111 1111 1111"; 
  String last4 = ccNumber.substring(15); 
  String last5 = ccNumber.substring(13, 14) + last4;
  
  public String convertName(String y) { 
    int commaLocation = y.indexOf(","); 
    String lastName = y.substring(0, commaLocation); 
    String firstName = y.substring(commaLocation + 1).trim(); 
    return firstName + " " + lastName; 
  }
  
  String firstLast = convertName("von Neumann, John"); 
  
  public String flip(String w) { 
    String result = ""; 
    String start = w;
    for (int i = 0; i < w.length(); i += 1) { 
      start = w.substring(i); 
      result = start.charAt(0) + result; 
    } 
    return result; 
  }
  
  public boolean isPalindrome(String w) { 
    int length_word = w.length();
    int half = length_word/2; 
    String start = w.substring(0, half); 
    String end = "";
    if (length_word % 2 == 0) { 
      end = w.substring(half); 
    } else {  
      end = w.substring(half + 1); 
    } 
    return flip(end).equals(start);
  }    
  
  public String cleanUp(String w) { 
    int length_word = w.length(); 
    String result = "";
    for (int i = 0; i < length_word; i += 1) { 
      if (java.lang.Character.isLetterOrDigit(w.charAt(i))) { 
        result = w.charAt(i) + result; 
      }
    } 
    result = result.toLowerCase(); 
    return result;   
  } 
  
  public boolean betterPalindrome(String w) { 
    return isPalindrome(cleanUp(w)); 
  } 
  
}