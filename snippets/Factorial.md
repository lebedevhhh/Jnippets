title: factorial
name: lebedevhh     
Date: 1/15/2023
Description: compute factorial of number using recursion (about factorials : https://youtu.be/pxh__ugRKz8)

```java
public static int Factorial(int n){
    if (n == 1){
        return n;
    }
    return n * Factorial(n - 1)
}
```