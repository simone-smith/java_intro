* These terms describe the action of type-checking, and refer to two different type systems.

* A type system is a collection of rules that assign a property called type to various constructs in a program, e.g. variables, functions etc

* A type defines a set of rules and protocols behind how a piece of data is supposed to behave (e.g. integers, booleans, arrays, queue, stack, pointers)

* Type checking verifies and enforces the constraints of type, and makes sure that the types make logical sense in the program so that it can be executed successfully.

* Type checking can occur at compile time (statically) or at runtime (dynamically), and is about ensuring that the program is type-safe, meaning that the possibility of type errors is kept to a minimum.

* Some programs throw type errors, others have built-in safety features to handle a type error and continue running.

* Static type checking:
    * A language is statically typed if the type of variable is known at compile time instead of at runtime. E.g. Java and Scala.
    * It allows many type errors to be caught early in the development cycle. It usually results in compiled code that executes more quickly because when the compiler knows the exact data types in use it can produce optimised machine code.


* Dynamic type checking:
    * This is the process of verifying the type safety of a program at runtime, e.g. JS, Ruby…. This may cause a program to fail at runtime due to type errors, so it is common to supplement development in dynamic languages with unit testing.
    * Generally results in less optimised code than static type checking, but opens doors for more powerful language features e.g. metaprogramming.


* Most statically-typed languages are usually compiled when executed, and most dynamically-typed languages are interpreted when executes, but this isn’t always the case.

* Static/dynamic typing refers to the language as a whole (e.g. Java is always statically typed). But compiled/interpreted refers to a specific language interpretation, so any language can in theory be compiled or interpreted. 
