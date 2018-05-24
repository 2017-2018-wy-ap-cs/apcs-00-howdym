import java.util.*; 

public class BikeInfo { 
  public String[] data; 
  
  public BikeInfo(String s) { 
    data = s.split(","); 
  } 
  
  public int getTripTime() { 
    String x = data[4].substring(1); 
    x = x.substring(0, x.length() - 1);
    return Integer.parseInt(x); 
  } 
  
  public boolean isSubscriber() { 
    return data[9].equals("\"Subscriber\""); 
  } 
  
  public boolean isFemale() { 
    return data[10].equals("\"Female\""); 
  } 
  
  public int dOfB() { 
    String x = data[11].substring(1); 
    x = x.substring(0, x.length() - 1);
    return Integer.parseInt(x); 
  } 
  
  public int iD() { 
    String x = data[0].substring(1); 
    x = x.substring(0, x.length() - 1);
    return Integer.parseInt(x); 
  } 
  
}