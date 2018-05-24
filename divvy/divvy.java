import java.util.*; 
import java.io.*; 

public class divvy { 
  private static ArrayList<BikeInfo> bikes = new ArrayList<BikeInfo>(); 
  
  public divvy() throws Exception { 
    File z = new File("./smalltrips.csv"); 
    Scanner f = new Scanner(z);
    int counter = 0;
    while (f.hasNextLine()) { 
      if (counter != 0) { 
        BikeInfo b = new BikeInfo(f.nextLine()); 
        bikes.add(b); 
      } else {
        f.nextLine();
        counter++; 
      } 
    } 
  }
  
  public static int findLongest() { 
    int counter = 0;
    int result = 0; 
    int tripTime = 0;
    for (int x = 0; x < bikes.size(); x++) { 
      if (bikes.get(x).getTripTime() > tripTime) { 
        tripTime = bikes.get(x).getTripTime(); 
        result = x; 
      } 
      counter++;
    } 
    System.err.println(counter + " lines were counted in this divvy file"); 
    return bikes.get(result).iD(); 
    // 13518263
  } 
  
  public static int findOldestWoman() { 
    int counter = 0;
    int result = 0; 
    int birthYear = 0;
    for (int x = 0; x < bikes.size(); x++) { 
      BikeInfo current = bikes.get(x); 
      if (current.isSubscriber()) { 
        if (current.isFemale()) { 
          if (birthYear == 0) { 
            birthYear = current.dOfB(); 
            result = x;
          } else if (birthYear > current.dOfB()) { 
            birthYear = current.dOfB(); 
            result = x;
          } 
        } 
      }
      counter++;
    }
    System.err.println(counter + " lines were counted in this divvy file.");
    return bikes.get(result).iD();
    // 13518905
  } 
  
  public static void main(String[] args) throws Exception { 
    divvy x = new divvy();
    System.out.println("The rider who had the longest ride has the id of: " + x.findLongest()); 
    /*for (BikeInfo y : bikes) { 
      System.err.println(Arrays.toString(y.data)); 
    }*/
    System.out.println("The oldest rider has the id of: " + x.findOldestWoman()); 
  }
  
}
    