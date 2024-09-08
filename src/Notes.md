# Learning Java

## The Anatomy Of Java Programs

### Functions

The smallest building blocks of a Java program,
a function is a block of code that performs a task:

```java

void sayHello() {
//    perform some task
}

defineReturnType functionName(functionParameters) {
    blockOfCode
}
```

not all functions return a value and those have `void` return type
each Java program should at least have one function and that function
is called **main**, it is the main entry point of our program, whenever
we execute a java program the main function is called and the code inside it
gets executed

```java
void main() {

}
```

functions in java don't exist on their own, they must belong to a class

### Classes

a class is a container for grouping related functions.

every java program must at least have one class and that class is called
**main**

here is how to define a class in java

```java
class ClassName {
    functionName(functionParameter) {
        codeBlock
    }
}
```

```java
class Main {
    void main() {

    }
}
```

functions defined inside a class are called methods of that class

in java all these classes and functions should have an access-modifier,

an access-modifier is a keyword that determines whether other functions and classes
can access a class and it's methods or not, like **public**, **private**, etc...

and here is the basic structure of a java program

```java
public Main {
    public void main () {

    }
}
```

*NOTE*: naming conventions in Java

1. PascalNamingConvention: for classes
2. camelNamingConvention: for functions/methods

## First Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
```

## How Java Code Gets Executed

When a Java program is executed, it follows several steps from writing code to actual execution.
Here’s a high-level overview of how Java programs are executed:

### 1. **Writing the Source Code**

- The programmer writes the Java source code using a `.java` file. This code is human-readable and contains the classes,
  methods, and logic for the program.

### 2. **Compiling the Source Code**

- The Java Compiler (`javac`) compiles the `.java` files into **bytecode**, which is stored in `.class` files. Bytecode
  is a low-level, platform-independent set of instructions that can be understood by the Java Virtual Machine (JVM).
- Unlike other languages (e.g., C, C++) that compile directly into machine code for a specific operating system, Java
  compiles into bytecode, making it platform-independent.

   ```
   javac MyProgram.java
   ```

### 3. **Java Virtual Machine (JVM)**

- The **Java Virtual Machine (JVM)** is a key part of the Java platform, responsible for executing bytecode. The JVM is
  platform-specific, meaning each operating system has its own version of the JVM.
- When you run a Java program, the JVM loads the `.class` files and starts interpreting the bytecode or uses *
  *Just-In-Time (JIT) compilation** to convert bytecode into machine code for faster execution.

   ```
   java MyProgram
   ```

### 4. **Class Loader**

- Before the bytecode is executed, the JVM uses the **class loader** to load necessary classes (from the `.class` files)
  into memory.
- Java uses a hierarchical class-loading system, allowing classes to be loaded only when needed.

### 5. **Bytecode Verification**

- After the class is loaded, the JVM performs **bytecode verification** to ensure the bytecode follows Java's security
  constraints, protecting the program from malicious code or errors.

### 6. **Execution**

- Once the bytecode passes verification, the JVM interprets it line by line or compiles it into machine code using the
  JIT compiler.
- The **Garbage Collector (GC)** runs periodically to free up memory by removing objects that are no longer needed.

### 7. **Just-In-Time (JIT) Compilation**

- For performance optimization, the JVM uses JIT compilation. It translates frequently executed bytecode into native
  machine code, speeding up execution for future runs of the same code.

### Summary:

1. You write Java source code (`.java` file).
2. The Java compiler (`javac`) converts it to bytecode (`.class` file).
3. The JVM loads the bytecode, verifies it, and interprets or compiles it to machine code.
4. The program executes on the specific platform, with the JVM handling memory management (via garbage collection) and
   other runtime tasks.

This approach allows Java to be **platform-independent** (write once, run anywhere) as the JVM acts as an abstraction
layer between the bytecode and the underlying hardware.