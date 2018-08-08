* A variable can only be defined once in a method, i.e. in ControlFlow.java, integer is defined on line 7 with `int integer = 0`. When referring to it again later in the method, don't type `int` again.


* Get user input by importing Scanner (`import java.util.Scanner`).
  * First create an instance of a scanner object: `Scanner scanner = new Scanner(System.in);`

  * Then, read input from the console:

    1. `System.out.println("Enter your name:");`
    2. `String name = scanner.nextLine();`


* Arrays can be instantiated and populated on the fly using the following syntax: `int[] array = {1, 2, 3, 4, 5, 6, 7};`
