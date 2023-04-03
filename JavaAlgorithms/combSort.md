title: combSort
name: shadee404
Date: 4/3/2023
Description: sort an array using the comb sort algo : https://youtu.be/n51GFZHXlYY

```java
public static void combSort(int[] arr) {
    int n = arr.length;
    int gap = n;
    boolean swapped = true;

    while (gap != 1 || swapped) {
        gap = getGap(gap);
        swapped = false;

        for (int i = 0; i < n - gap; i++) {
            if (arr[i] > arr[i + gap]) {
                int tmp = arr[i];
                arr[i] = arr[i + gap];
                arr[i + gap] = tmp;
                swapped = true;
            }
        }
    }
}

public static int getGap(int gap) {
    gap = (gap * 10) / 13;

    if (gap < 1) {
        return 1;
    }

    return gap;
}
```