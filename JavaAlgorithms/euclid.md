title: euclid algorithm
name: lebedevhh_
Date : 2/14/2023
Description : find the gcd using the euclid's algorithm


```java
static int gcd(int p, int q){
    if (q == 0){
        return p;
    }
    else return gcd(q, p%q/);
}
```