// can you remember how to set up your main function?
public class LoopThroughArray {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    // loop through an integer array and print out each element
    System.out.println("looping over an array using for loop"); for(int i=0; i< array.length; i++){
      System.out.println("current element is: " + array[i]);
    }
  }
}
