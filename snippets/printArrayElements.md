title: printArrayElements
name: spacenough
Date : 1/18/2023 
Description : This way the method can be called on any type of array and the elements will be printed to the console


```java
 public static <T> void printArrayElements(T[] array) {
     Stream.of(array).forEach(System.out::println);
 }
```
