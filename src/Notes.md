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
class ClassName{
    functionName(functionParameter){
        codeBlock
    }
}
```

```java
class Main{
    void main(){
        
    }
}
```
functions defined inside a class are called methods of that class

in java all these classes and functions should have an access-modifier,

an access-modifier is a keyword that determines whether other functions and classes
can access a class and it's methods or not, like **public**, **private**, etc...

and here is the basic structure of a java program
```java
public Main{
    public void main(){
        
    }
}
```
*NOTE*: naming conventions in Java
1. PascalNamingConvention: for classes
2. camelNamingConvention: for functions/methods

## First Java Program