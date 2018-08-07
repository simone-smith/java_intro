import java.util.Arrays;
import java.util.ArrayList;

// can you remember how to set up your main function?
public class PrintArrays {
  public static void main(String[] args) {
    // declare an array of Strings and print it
    String[] stringArr = new String[2];
    stringArr[0] = "Hello";
    stringArr[1] = "Goodbye";
    System.out.println(Arrays.toString(stringArr));

    // declare an array of integers and print it
    int[] intArr = new int[2];
    intArr[0] = 1;
    intArr[1] = 2;
    System.out.println(Arrays.toString(intArr));
    // declare an ArrayList of integers, add numbers to it, and then print it
    ArrayList<Integer> arrL = new ArrayList<Integer>(2);
    arrL.add(1);
    arrL.add(2);
    System.out.println(arrL);
  }
}
