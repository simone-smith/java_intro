// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main(String[] args) {
    //  bonus: use a while loop to continue checking until the user types 17
    int integer = 0;
    while(integer != 17){
      System.out.println("Enter an integer: ");
      // find a way to read in user input
      Scanner scanner = new Scanner(System.in);
      integer = scanner.nextInt();
    // write a method that will check if a number is odd or even
    // (assume user only ever enters integers)
    // print the answer to the console
      if((integer % 2) == 0) {
        System.out.println(integer + " is even");
      }else{
        System.out.println(integer + " is odd");
      }
    }
  }
}
