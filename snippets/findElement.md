title: findElement
name: lebedevhh     
Date: 1/25/2023
Description: returns the index of the wanted element in an array

```java
public static <T> int search(T element, T[] arr){
    int idx = -1;

    for (int i = 0; i < arr.length; i++){
        if (arr[i] == n){
            idx = i;
        }
    }

    return idx;
}
```