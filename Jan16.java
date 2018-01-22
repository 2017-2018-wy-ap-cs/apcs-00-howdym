import java.util.Arrays;

public class Jan16 { 
  public static int[][] makeBoard(int rows, int col) { 
    int[][] answer = new int[rows][col]; 
    for (int r = 0; r < rows; r++) { 
      for (int c = 0; c < col; c++) { 
        if (r == 0 || r == rows - 1 || c == 0 || c == col - 1) { 
          answer[r][c] = 0; 
        } else { 
          answer[r][c] = 1; 
        } 
      } 
    } 
    return answer;
  }
  
  public static int[][] boxSplit(int[] x) { 
    int half = x.length / 2;
    int[][] answer = new int[2][half]; 
    for (int y = 0; y < x.length; y++) { 
      answer[y/half][y%half] = x[y]; 
    }
    return answer;
  } 
  
  public static void main (String[] args) { 
    System.out.println(Arrays.deepToString(makeBoard(5,7))); 
    int[] data = {10,20,40,80,120,160};
    System.out.println(Arrays.deepToString(boxSplit(data)));
  }
}