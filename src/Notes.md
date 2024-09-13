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

## Constants

In Java, a **constant** is a variable whose value cannot be changed once it's initialized. Constants are typically used
to represent fixed values that are repeated in the program, such as mathematical constants, configuration settings, or
default values.

### How to Define Constants in Java:

1. **Using `final` keyword**:
   To make a variable a constant, you use the `final` keyword. Once a `final` variable is assigned a value, it cannot be
   modified.

   ```java
   final int DAYS_IN_WEEK = 7;
   ```

2. **Naming Convention**:
   By convention, constants in Java are named in all uppercase letters with words separated by underscores.

   ```java
   final double PI = 3.14159;
   final int MAX_USERS = 100;
   ```

### Key Characteristics of Constants:

- **Value cannot be changed**: After initialization, a constant’s value is immutable.
- **Must be initialized when declared**: A constant has to be assigned a value at the time of declaration or in the
  constructor (for instance variables).

   ```java
   final int MAX_SCORE;
   public MyClass() {
       MAX_SCORE = 100; // Can only be set once, even in a constructor
   }
   ```

3. **Common Use Cases**:
    - Constants help prevent "magic numbers" in the code, which are hard-coded values scattered around the program.
      Using named constants improves readability and maintainability.
    - Constants are also helpful when values need to be shared across multiple classes in an application.

### Example of Constants in Java:

```java
public class ConstantsExample {

    public static void main(String[] args) {
        // Defining constants
        final double PI = 3.14159;  // Common constant (static for sharing across instances)
        final int MAX_USERS = 100;  // Application-wide constant

        // Using constants in calculations
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);

        System.out.println("Maximum number of users allowed: " + MAX_USERS);
    }
}
```

### Types of Constants:

1. **Class Constants (`static final`)**:
   Constants that are shared across all instances of a class should be declared `static final`. These constants are
   often used for values that belong to the class itself rather than any specific object.

   ```java
   public static final String APP_NAME = "MyApplication";
   ```

2. **Instance Constants (`final`)**:
   These constants are specific to a particular instance of a class. Even though they are constants, each object of the
   class can have its own value assigned when the object is created (in the constructor).

   ```java
   public final int id;
   
   public MyClass(int id) {
       this.id = id;  // Can only be assigned once per object
   }
   ```

### Benefits of Using Constants:

- **Readability**: Constants make code easier to understand because meaningful names replace hardcoded values.
- **Maintainability**: If a constant value changes, you only need to update it in one place.
- **Avoids errors**: Using constants helps prevent accidental modifications of important values that shouldn't change
  during program execution.

### Important Points to Remember:

- `final` variables can only be assigned a value once.
- If a constant is `static`, it belongs to the class and is shared across all instances.
- Constants improve code clarity, making it easier to understand what certain values represent.

## Arithmetic Expressions

In Java, an **arithmetic expression** is a combination of variables, constants, and operators that are evaluated to
produce a numeric result. Java supports common arithmetic operations like addition, subtraction, multiplication,
division, and more, using **arithmetic operators**.

### Arithmetic Operators in Java:

Here are the main arithmetic operators:

| Operator | Description         | Example                                        |
|----------|---------------------|------------------------------------------------|
| `+`      | Addition            | `a + b` (adds `a` and `b`)                     |
| `-`      | Subtraction         | `a - b` (subtracts `b` from `a`)               |
| `*`      | Multiplication      | `a * b` (multiplies `a` by `b`)                |
| `/`      | Division            | `a / b` (divides `a` by `b`)                   |
| `%`      | Modulus (remainder) | `a % b` (remainder when `a` is divided by `b`) |

### Example of Arithmetic Expression:

```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;

        // Basic arithmetic operations
        int sum = a + b;               // 10 + 20 = 30
        int difference = b - a;        // 20 - 10 = 10
        int product = a * c;           // 10 * 5 = 50
        int quotient = b / c;          // 20 / 5 = 4
        int remainder = b % c;         // 20 % 5 = 0

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
```

### Operator Precedence:

In Java, operators are evaluated based on precedence (order of operations). The precedence determines which part of the
expression is evaluated first.

1. **Multiplication (`*`), Division (`/`), and Modulus (`%`)** have higher precedence than Addition (`+`) and
   Subtraction (`-`).
2. **Parentheses** can be used to group expressions and override the default precedence.

#### Example:

```java
int result = 10 + 5 * 3;    // Multiplies first, then adds: 10 + (5 * 3) = 25
int result2 = (10 + 5) * 3; // Parentheses first: (10 + 5) * 3 = 45
```

### Integer Division vs. Floating-point Division:

- **Integer division** (`/`): When both operands are integers, the result is an integer, and any fractional part is
  discarded (not rounded).

  ```java
  int result = 10 / 3;  // Result is 3, not 3.33
  ```

- **Floating-point division**: If at least one operand is a floating-point type (`float` or `double`), the result
  includes decimal places.

  ```java
  double result = 10.0 / 3; // Result is 3.333...
  ```

### Modulus Operator (`%`):

The modulus operator gives the **remainder** of a division. It’s useful for tasks like determining if a number is even
or odd.

#### Example:

```java
int remainder = 10 % 3;  // Result is 1 because 10 divided by 3 gives a remainder of 1
```

### Compound Assignment Operators:

Java provides **compound assignment operators** to simplify arithmetic operations and assignments. These operators
combine an arithmetic operation with assignment in one step.

| Compound Operator | Equivalent Expression | Example   |
|-------------------|-----------------------|-----------|
| `+=`              | `a = a + b`           | `a += 5;` |
| `-=`              | `a = a - b`           | `a -= 3;` |
| `*=`              | `a = a * b`           | `a *= 2;` |
| `/=`              | `a = a / b`           | `a /= 4;` |
| `%=`              | `a = a % b`           | `a %= 3;` |

#### Example:

```java
int a = 10;
a +=5;  // Same as a = a + 5; Now a is 15
a *=2;  // Same as a = a * 2; Now a is 30
```

### Increment and Decrement Operators:

Java provides shorthand operators to **increment** and **decrement** a variable's value by `1`.

- **Increment (`++`)**:
    - `a++`: Post-increment (returns the value before incrementing)
    - `++a`: Pre-increment (increments the value first, then returns it)

- **Decrement (`--`)**:
    - `a--`: Post-decrement (returns the value before decrementing)
    - `--a`: Pre-decrement (decrements the value first, then returns it)

#### Example:

```java
int a = 5;
int b = a++;  // b is 5, a becomes 6
int c = ++a;  // a becomes 7, then c is 7
```

### Arithmetic Expression Example:

```java
public class ExpressionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = (a + b) * 2 - b;  // (10 + 5) * 2 - 5 = 25

        System.out.println("Result: " + result);  // Output: Result: 25
    }
}
```

In summary, arithmetic expressions in Java are used to perform mathematical calculations using various operators.
Operator precedence and data types (like integer vs. floating-point) can affect the result of an expression, so
understanding how to control these behaviors is important in writing correct programs.

## Casting and Type-conversion

In Java, **casting** and **type conversion** are mechanisms that allow you to change one data type into another. While
they are often used interchangeably, they refer to slightly different concepts depending on whether you're working with
**primitive types** or **reference types** (objects).

### 1. **Type Conversion**:

Type conversion (also known as **implicit casting** or **automatic type conversion**) occurs when the Java compiler
automatically converts one data type to another. This happens when there’s no risk of data loss or when converting from
a smaller to a larger data type (widening conversion).

#### Example of Type Conversion:

```java
int num = 100;
double d = num;  // Automatic conversion from int to double
System.out.

println(d);  // Outputs 100.0
```

In the example above, the integer value `num` is automatically converted into a `double`, which is a wider data type.
This is called **widening conversion** and is done automatically by the Java compiler.

#### Types of Automatic Conversions:

- `byte` → `short` → `int` → `long` → `float` → `double`
- `char` → `int` → `long` → `float` → `double`

### 2. **Casting**:

Casting is an explicit type conversion, where you manually convert one data type into another. This is necessary when
the conversion might result in **loss of data** (narrowing conversion), or when converting between incompatible types.

#### Types of Casting in Java:

- **Primitive Type Casting**: This involves converting between primitive data types.
- **Reference Type Casting**: This involves casting between classes and interfaces.

#### Example of Primitive Casting:

```java
double d = 9.7;
int i = (int) d;  // Explicit casting from double to int
System.out.

println(i);  // Outputs 9
```

Here, a `double` is explicitly cast to an `int`. Since `double` has a decimal part, casting to `int` results in
truncation (the decimal part is lost).

#### Primitive Casting Types:

- **Widening Casting** (automatically done): Converts a smaller type to a larger type.
    - Examples: `int` to `double`, `float` to `double`
- **Narrowing Casting** (done manually): Converts a larger type to a smaller type.
    - Examples: `double` to `int`, `long` to `short`

#### Example of Narrowing Conversion:

```java
long l = 1000L;
int i = (int) l;  // Explicit casting from long to int
System.out.

println(i);  // Outputs 1000
```

### 3. **Reference Type Casting**:

Reference type casting is used when converting between objects in an inheritance hierarchy. You can cast from a subclass
to a superclass (upcasting, which is automatic) or from a superclass to a subclass (downcasting, which is explicit).

- **Upcasting**: Converting a subclass type to a superclass type (automatic).
- **Downcasting**: Converting a superclass type to a subclass type (explicit).

#### Example of Upcasting:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting (automatic)
        a.sound();  // Outputs "Dog barks" (polymorphism)
    }
}
```

#### Example of Downcasting:

```java
Animal a = new Dog();  // Upcasting
Dog d = (Dog) a;  // Downcasting (explicit)
d.

sound();  // Outputs "Dog barks"
```

Downcasting should only be done when you are certain that the object is of the correct subclass type. Otherwise,
a `ClassCastException` will occur.

### Summary of Key Points:

1. **Type Conversion**:
    - Automatic conversion (no data loss).
    - Happens when moving from a smaller type to a larger type (widening).
    - Examples: `int` to `double`, `char` to `int`.

2. **Casting**:
    - Manual conversion (explicit).
    - Necessary when there's potential data loss or incompatibility.
    - **Narrowing casting** (e.g., `double` to `int`) requires explicit casting.
    - **Downcasting** (casting from a superclass to a subclass) requires explicit casting.

3. **Primitive Type Casting**:
    - Automatic widening (smaller to larger).
    - Manual narrowing (larger to smaller).

4. **Reference Type Casting**:
    - **Upcasting** (subclass to superclass) is automatic.
    - **Downcasting** (superclass to subclass) is explicit.

Understanding casting and type conversion in Java is essential, especially when dealing with different types of
variables or working with object-oriented programming.

## The Math Class

The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm,
square root, and trigonometric functions.

```java

public class MathClass {
    public static void main() {
        float rounded = Math.round(123.57);
        System.out.println(rounded);
        int ceil = (int) Math.ceil(1.1); // ceiling of 1.1 is 1 but the Math.ceil returns a double, cast to int
        System.out.println(ceil);

        int sqrt = (int) Math.sqrt(8);// Math.sqrt return double here need to convert to int
        System.out.println(sqrt);
        int max = Math.max(1, 10);
        System.out.println(max);
        //int rand =(int) Math.random(); // the result of casting Math.random to int is always 0
        //int rand = (int) Math.round(Math.random() * 100); // random value 1 to 100 int
        //int rand = (int) (Math.random() * 100); // random value 1 to 100 int
        double rand = Math.random() * 100; // random value 1 to 100 double
        //double rand = Math.random(); // random value 0 to 1
        System.out.println(rand);

    }

}

```