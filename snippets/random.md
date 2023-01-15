title: Random
name: spacenough
Date : 1/15/2023 
Description : Generates a random number between two integers


```java
 public static int random(int a, int b) {
     Random defaultRandom = new Random();
     return defaultRandom.nextInt(b - a) + a;
 }
```
