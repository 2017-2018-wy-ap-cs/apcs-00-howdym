public class Jan9 {
  public static String rep(String what, int howMany) { 
    String result = ""; 
    for(int z = 0; z < howMany; z++) { 
      result = result + what; 
    } 
    return result; 
  }
  
  public static String tree(int h, int w) { 
    int crownHeight = h - 4;
    int gaps = crownHeight/2 - 1; 
    int shift = 0; 
    if (crownHeight % 2 == 1) { 
      shift = crownHeight / 2 - 1; 
    } else { 
      shift = crownHeight / 2 - 2; 
    } 
    String s = ""; 
    String crown = rep("_", gaps) + rep("*", w) + rep("_", gaps) + "\n"; 
    for (int x = 0; x < crownHeight-2; x++) { 
      int shiftGap = gaps - 1 - x; 
      int widthGap = w + 2 * x; 
      if (x >= shift) { 
        shiftGap = gaps - 1 - (crownHeight - 2 - x); 
        widthGap = w + 2 * (crownHeight - 2 - x);
      } 
      s = s + rep("_", shiftGap) + "*" + rep(" ", widthGap) + "*" + rep("_", shiftGap) + "\n"; 
    } 
    String trunk = rep(rep("*", 3) + "\n", 4); 
    return crown + s + crown + trunk; 
  }
      
}
