title: quicksort
name: lebedevhh     
Date: 1/25/2023
Description: implements the quicksort algo. If needed : https://youtu.be/h8eyY7dIiN4

```java
    private static void quicksort(int[] array, int lIdx, int hIdx){
        if (lIdx >= hIdx){
            return;
        }
        int pivot = array[hIdx];
        int lp = lIdx; 
        int rp = hIdx;
    
        while (lp < rp){
            while (array[lp] <= pivot && lp < rp){
                lp++;
            }

            while (array[rp] >= pivot && lp < rp){
                rp--;
            }

            swap(array, lp, rp);
        }
        swap(array, lp, hIdx);
        quicksort(array, lIdx, lp-1);
        quicksort(array, lp+1, hIdx);
    }

    private static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2]; 
        arr[idx2] = temp;
    }
```