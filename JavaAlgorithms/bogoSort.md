title: bogoSort
name: shadee404
Date: 4/3/2023
Description: sort an array using the bogo sort algo : https://youtu.be/TDnIa2aGcwI

```java
public static void bogoSort(int[] arr) {
    while (!isSorted(arr)) {
        shuffle(arr);
    }
}

public static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1]) {
            return false;
        }
    }

    return true;
}

public static void shuffle(int[] arr) {
    Random rand = new Random();

    for (int i = 0; i < arr.length; i++) {
        int j = rand.nextInt(arr.length);
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
```