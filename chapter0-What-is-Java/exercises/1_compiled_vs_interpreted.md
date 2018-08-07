* Compilation is converting code to machine code so that it can be executed through the operating system. Interpretation is evaluating code line by line through another program which handles executing the code.

* In a compiled language, the program is expressed in the instructions of the target machine; the machine code is unreadable by humans.

* In an interpreted language, the instructions are read and executed by some other program.

* Most programming languages have compiled and interpreted implementations.

* Advantages of compiled languages - execution speed and efficiency. Low-level languages tend to be compiled, because efficiency is usually more of a concern than cross-platform support. But just-in-time compilation is speeding up the efficiency of interpreted languages.

* Disadvantages of compiled languages - need to first manually compile a program before you can run it. Can make debugging very tedious. They’re also not platform-independent.

* Advantages of interpreted languages - platform independence, reflection, dynamic typing, smaller executable program size, dynamic scoping

* Bytecode languages combine both compilation and interpretation, e.g. Java (the JVM interprets byte code).
    * The first step is to compile the current program from its human-readable language into bytecode. 
    * The byte code is then passed to a virtual machine which acts as the interpreter.
    * The largest benefit of byte code languages is platform independence, while still having a faster execution time than interpreted languages.
