import java.lang.Integer;

public class Demo {
  public static void printLoop(int n){
      String line = "";
      int value = 0;
      for (int i = 0; i < n; i++) {
          value = i + 1;
          for (int j = 0; j < (n-i); j++) {
              line = line + value;
          }
          System.out.println(line);
          line = "";
      }
  }

    public static void main(String[] args) {
      if (args.length == 0) {
        printLoop(5);
      } else {
        printLoop(Integer.valueOf(args[0]));
      }
    }

}
