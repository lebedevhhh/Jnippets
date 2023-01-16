title: factorial
name: lebedevhh     
Date: 1/16/2023
Description: Compute the n-th fibonacci number using recursion. (NOTE : check https://www.youtube.com/watch?v=cum3OrpURzc for better implementation);


```java
static int Fibonacci(int n){
    if (n <= 1){
        return n;
    }
    return (Fibonacci(n-1) + Fibonacci(n-2));
}
```