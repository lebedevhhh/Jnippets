title: sumDigitsOfNumber.md
name: lebedevhh__
Date: 1/14/2023
Description : sum the digits of a number 



```java
static int sumDigitsOfNumber(int nunber){
    String n = String.format("%d", number);
    String[] strings = n.split("");
    int sum = 0;
    for (String c : strings){
        sum += Integer.parse(c);
    }
    return sum;
}
```