import java.lang.*;
import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*; 

public class Feb8QuizTest { 
  Feb8Quiz w = new Feb8Quiz(0); 
  Feb8Quiz x = new Feb8Quiz(1); 
  Feb8Quiz y = new Feb8Quiz(2); 
  Feb8Quiz z = new Feb8Quiz(3); 
  
  ArrayList<String> answer1 = w.makeAnswers(0); 
  ArrayList<String> answer2 = x.makeAnswers(1); 
  ArrayList<String> answer3 = y.makeAnswers(2);
  ArrayList<String> answer4 = z.makeAnswers(3);
  
  public void massChange() {
    w.penguins(w.ace); 
    x.penguins(x.ace); 
    y.penguins(y.ace); 
    z.penguins(z.ace);
  }
  
  @Test 
  public void test1() { 
    massChange();
    //assertArrayEquals(w.ace.toArray(), answer1.toArray());
    assertArrayEquals(x.ace.toArray(), answer2.toArray());
    assertArrayEquals(y.ace.toArray(), answer3.toArray());
    assertArrayEquals(z.ace.toArray(), answer4.toArray());
  }
}