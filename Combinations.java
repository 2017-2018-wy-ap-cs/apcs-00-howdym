import java.util.*;

public class Combinations { 
  public Combinations() { 
    // do nothing 
  }
  
  public static String[] getAllLists(String[] elements, int lengthOfList) {
    //initialize our returned list with the number of elements calculated above
    String[] allLists = new String[(int)Math.pow(elements.length, lengthOfList)];

    //lists of length 1 are just the original elements
    if (lengthOfList == 1) { 
      return elements; 
    } else {
      //the recursion--get all lists of length 3, length 2, all the way up to 1
      String[] allSublists = getAllLists(elements, lengthOfList - 1);
      System.err.println(Arrays.toString(allSublists));

      //append the sublists to each element
      int arrayIndex = 0;

      for(int i = 0; i < elements.length; i++){
        for(int j = 0; j < allSublists.length; j++){
          //add the newly appended combination to the list
          allLists[arrayIndex] = elements[i] + allSublists[j];
          System.err.println(Arrays.toString(allLists));
          arrayIndex++;
        }
      }
      return allLists;
    }
  }

  public static void permute(int start, int[] input) {
    System.err.println("You are here.");
    if (start == input.length) {
      System.out.println(Arrays.toString(input));
      for(int x: input){
        System.out.print(x);
      }
      System.out.println("");
      return;
    }
    for (int i = start; i < input.length; i++) {
      System.err.println("This is i: " +i);
      System.err.println("This is start: " +start);
      // swapping
      int temp = input[i];
      input[i] = input[start];
      input[start] = temp;
      // swap(input[i], input[start]);
      System.err.println(Arrays.toString(input));
      
      permute(start + 1, input);
      // swap(input[i],input[start]);
      
      System.err.println("This is start3: " +start); 
      System.err.println("This is i: " +i); 
      System.err.println(Arrays.toString(input));
      int temp2 = input[i];
      input[i] = input[start];
      input[start] = temp2;
      System.err.println(Arrays.toString(input));
    }
  }
  
  public static void main(String[] args){
    /* String[] database = {"a","b","c"};
    for(int i=1; i<=database.length; i++){
      String[] result = getAllLists(database, i);
      for(int j=0; j<result.length; j++){
        System.out.println(result[j]);
      }
    } */
    
    int[] a={1,2,3,4};
    permute(0, a);  
    
  }
  
}