import java.lang.Integer;
import java.util.Random;

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


    public static String arrToString(int[] arr) {
        String answer = "{";
        if (arr.length == 0) {
            return "{}";
        }
        for (int i = 0; i < arr.length-1; i++) {
            answer = answer + (arr[i] + ", ");
        }
        return (answer + arr[arr.length-1] + "}");
    }


    public static String arrayDeepToString(int[][] arr) {
        String answer = "{";
        for (int i = 0; i < arr.length-1 ; i++) {
            answer = answer + arrToString(arr[i]);
        }
        return (answer + arrToString(arr[arr.length-1]) + "}");
    }


    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        Random rand = new Random();
        int value = 0;
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                value = rand.nextInt(maxValue+1);
                arr[i][j] = value;
            }
        }
        return arr;
    }


    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        Random rand = new Random();
        int value = 0;
        int insideValue = 0;
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            value = rand.nextInt(cols+1);
            int[] row = new int[value];
            arr[i] = row;
            for (int j = 0; j < value-1; j++) {
                insideValue = rand.nextInt(maxValue+1);
                arr[i][value-1] = insideValue;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        // test printLoop
        if (args.length == 0) {
            printLoop(5);
        } else {
            printLoop(Integer.valueOf(args[0]));
        }
        // ---

        // test arrayDeepToString
        int[][] arr = {{1,2}, {2,3}};
        System.out.println(arrayDeepToString(arr).replace("}, ","},\n "));
        // ---

        // test create2DArray
        create2DArray(6, 4, 4);
        // ---

        // test create2DArrayRandomized
        create2DArrayRandomized(4, 10, 100);
        // ---
    }

}
