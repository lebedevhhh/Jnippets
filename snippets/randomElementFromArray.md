title: RandomElementFromArray
name: spacenough
Date : 1/15/2023 
Description : Generates a random element from a given array, any array type can be used


```java
public static <T> T randomElementFromArray(T @NotNull [] array) {
  Random defaultRandom = new Random();
  int randomIndex = defaultRandom.nextInt(array.length);

  return array[randomIndex];
}
```
