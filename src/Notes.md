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

## Variables

to declare a variable you first need to specify the data-type for that variable

```java
public class Main {
    public static main() {
        int myAge = 24;
        system.out.println(myAge);
    }
}

```

## Data Types

Data types in Java define the type of data that can be stored in a variable, how much memory it occupies, and the
operations that can be performed on that data. Java is a statically typed language, meaning each variable must be
declared with a data type before use.

### **Types of Data Types in Java**

Java has two main categories of data types:

1. **Primitive Data Types**
2. **Reference (Non-Primitive) Data Types**

---

## **1. Primitive Data Types**

Primitive data types are the basic building blocks of data manipulation in Java. There are 8 primitive data types:

| Data Type | Size (bits)               | Default Value | Range (approximate)    | Description                                                   |
|-----------|---------------------------|---------------|------------------------|---------------------------------------------------------------|
| `byte`    | 8                         | 0             | -128 to 127            | Smallest integer type. Useful for saving memory.              |
| `short`   | 16                        | 0             | -32,768 to 32,767      | Short integer type.                                           |
| `int`     | 32                        | 0             | -2^31 to 2^31 - 1      | Default integer type. Most commonly used.                     |
| `long`    | 64                        | 0L            | -2^63 to 2^63 - 1      | Large integer type. Used when `int` is not sufficient.        |
| `float`   | 32                        | 0.0f          | 1.4E-45 to 3.4E+38     | Single-precision floating-point number.                       |
| `double`  | 64                        | 0.0d          | 4.9E-324 to 1.7E+308   | Double-precision floating-point number. Default for decimals. |
| `char`    | 16                        | '\u0000'      | 0 to 65,535 (unsigned) | Used to store single characters (Unicode characters).         |
| `boolean` | 1 (not precisely defined) | `false`       | `true` or `false`      | Stores logical values, true or false.                         |

### **Key Points About Primitive Data Types**:

- **Memory-efficient**: Primitive data types are more memory-efficient than objects.
- **No methods**: They do not have methods like objects.
- **Default values**: If not initialized, they have default values (e.g., 0 for integers, false for boolean).

---

## **2. Reference (Non-Primitive) Data Types**

Reference data types in Java are used to store references to objects. These include:

- **Classes**
- **Interfaces**
- **Arrays**
- **Strings**

Unlike primitive types, reference types store the memory address (or reference) where the actual object is located.

### **Common Reference Data Types**:

1. **Classes**: A class is a blueprint for creating objects. When you create an object from a class, that object becomes
   a reference type.
    ```java
    String name = "John";  // `name` is a reference to a String object
    ```

2. **Arrays**: Arrays in Java are reference types, which store multiple values of a specific type.
    ```java
    int[] numbers = {1, 2, 3, 4};  // `numbers` is a reference to an array object
    ```

3. **Strings**: Even though they are commonly used, `String` is a reference type, not a primitive one. Strings in Java
   are immutable.
    ```java
    String message = "Hello, Java!";
    ```

### **Key Points About Reference Data Types**:

- **Stores references**: Reference data types store the address (reference) of the actual data.
- **Objects and methods**: Reference types allow you to create objects that have methods and fields.
- **Null**: If a reference type is not initialized, it defaults to `null`.
- **Dynamic memory allocation**: Reference types are dynamically allocated in memory (on the heap).

---

## **Example Usage**:

```java
public class Main {
    public static void main(String[] args) {
        // Primitive data types
        int age = 25;       // integer type
        double salary = 50000.50; // floating-point type
        boolean isEmployed = true; // boolean type

        // Reference data types
        String name = "Alice";    // reference to a String object
        int[] numbers = {1, 2, 3}; // reference to an array of integers

        System.out.println(name + " is " + age + " years old.");
    }
}
```

### **Key Differences Between Primitive and Reference Data Types**:

| Feature             | Primitive Data Types                   | Reference Data Types                 |
|---------------------|----------------------------------------|--------------------------------------|
| **Memory Location** | Stored in the stack memory.            | Stored in the heap memory.           |
| **Default Value**   | Zero (0), false, or null character.    | `null` if not initialized.           |
| **Operations**      | Can only store values.                 | Can have methods and fields.         |
| **Mutability**      | Immutable (the value itself is fixed). | Mutable (object's state can change). |

---

In summary, data types in Java are divided into primitive (simple values) and reference types (objects and arrays).
Understanding these types is crucial for efficient memory use and performance in Java applications.

## Escape Sequences

When you need special character in your string you need to escape them to make it work
the escape-sequences start with a **\\** like **\n** for newline, **\\"** for a single double-quote,
**\\\\** for single back-slash and **\s** for a space-character

## Arrays

In Java, an **array** is a data structure that stores a fixed-size sequence of elements of the same type. Each element
in the array can be accessed using an index, starting from `0` for the first element. Arrays are useful when you know in
advance the number of elements you want to store.

### Key Points about Arrays in Java:

1. **Declaration:**
   You declare an array by specifying the type of its elements and using square brackets `[]`. You can either initialize
   the array immediately or later.

   ```java
   // Declaration without initialization
   int[] numbers;
   
   // Declaration and initialization with size
   int[] numbers = new int[5]; // An array of 5 integers
   // dataType[] arrayName = new dataType[numberOfElements];
   ```
   use **new** operator because arrays are reference-type

2. **Initialization:**
   You can initialize an array with specific values when declaring it.

   ```java
   int[] numbers = {10, 20, 30, 40, 50}; // Array of integers with 5 elements
   ```

3. **Accessing Elements:**
   Array elements are accessed using their index. The index starts from `0` up to `n-1` where `n` is the size of the
   array.

   ```java
   int first = numbers[0]; // Access first element, 10
   numbers[1] = 25;        // Update second element to 25
   ```

4. **Length of an Array:**
   The size of the array can be accessed using the `.length` property.

   ```java
   int size = numbers.length; // Get the length of the array (5)
   ```

5. **Multidimensional Arrays:**
   You can create arrays with multiple dimensions (like a matrix).

   ```java
   int[][] matrix = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
   };
   
   int value = matrix[1][2]; // Accesses element at row 2, column 3 (6)
   matrix[0][2] = 99; // set element at row 1, column 3  to (99)
   ```

### Example of Using Arrays in Java:

```java
public class ArrayExample {
    public static void main(String[] args) {
        // Create an array of 5 integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Loop through the array and print each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element
        numbers[2] = 35;
        System.out.println("Updated element at index 2: " + numbers[2]);
    }
}
```

### Characteristics of Java Arrays:

- **Fixed size**: Once created, the size of an array cannot change.
- **Type-safe**: Arrays can only hold elements of the specified type.
- **Zero-based indexing**: The first element is at index `0`, and the last is at `length - 1`.

Java arrays are a fundamental structure used in most programs, but in larger or more dynamic cases, other structures
like `ArrayList` or `LinkedList` may be more flexible.
