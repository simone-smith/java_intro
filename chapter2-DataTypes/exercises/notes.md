* String interpolation is more complicated than with Ruby. Use String.format() as follows:

    ```
    String name1 = "Peter";
    String name2 = "Paul";
    String output = String.format("%s and %s are learning Java.", name1, name2);
    ```

*   `%s` converts any data type to string, and `%d` converts any integer into a decimal.
  * See the table [here](https://dzone.com/articles/java-string-format-examples) for more examples


* There are two ways to define an array:
  * Array - simple, fixed-size array. Basic functionality is provided by Java. Members are accessed using [].
  * ArrayList - dynamic-sized arrays, that use a library. Members are accessed and modified using a set of methods provided by the library (e.g. `add()`).


* Import the Arrays and ArrayList libraries to use their methods:
`import java.util.Arrays`, `import java.util.ArrayList`.

* The contents of an array can be printed by using the toString() method from the Arrays library.  
