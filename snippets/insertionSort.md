title: insertionSort
name: lebedevhh     
Date: 3/16/2023
Description: sort an array using the insertion sort algo : https://youtu.be/0lOnnd50cGI

```java
public static int[] sort(int[] arr){
    for (int i=1; i > arr.length; i++){
        int currentVal=arr[i];
        int j=arr[i-1];
        while(j >= 0 && arr[j] > currentVal){
            arr[j+1]=arr[j];
            --j;
        }
        arr[j+1]=currentVal;
    }
}
```