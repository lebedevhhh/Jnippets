title: Binary Search
name: lebedevhh_
Date : 2/14/2023
Description : Binary search on sorted array, returns the index of the found number


```java
static int binSearch(int[] array, int numberToFind){
    int lP = array.length - 1;
    int fP = 0;

    while (fP <= lP){
        int middleP = (lP + fP)/2;
        if (numberToFind == array[middleP]){
            return middleP;
        }
        if (numberToFind > array[middleP]){
            fP = middleP + 1;
        }
        else{
            lP = middleP - 1;
        }
    }
    return -1; //not found
}
```