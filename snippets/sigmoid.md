title: sigmoid
name: lebedevhh_
Date : 1/21/2023 
Description : Output of the sigmoid function (doesnt accept arrays). For more info : https://en.wikipedia.org/wiki/Sigmoid_function


```java
static <T> T sigmoid(T number){
    return  1 /(1+Math.exp(-number));
}
```