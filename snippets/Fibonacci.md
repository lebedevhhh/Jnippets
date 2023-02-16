title: factorial
name: lebedevhh     
Date: 1/16/2023
Description: Compute the n-th fibonacci number using memoization


```java
//without memo
public class fib{
    private static long[] cache;
 
    static int Fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return (Fibonacci(n-1) + Fibonacci(n-2));
    }

    static int fib(int n){
        if (n <= 1){
            return n;
        }
        
        if (cache[n] != 0){
            return cache[n];
        }
        
        int nthN = (Fibonacci(n-1) + Fibonacci(n-2));
        cache[n] = nthN;
        return nthN;
    }

    public static void main(String[] args){
        int n = 10; //choose any number
        cache = long[n+1];
        System.out.println(fib(n));
    }


}
```