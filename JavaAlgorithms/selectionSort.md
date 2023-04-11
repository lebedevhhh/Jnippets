title: selectionSort
name: shadee404
Date: 4/3/2023
Description: sort an array using the selection sort algo : https://youtu.be/cqh8nQwuKNE

```java
public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        int tmp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = tmp;
    }
}
```