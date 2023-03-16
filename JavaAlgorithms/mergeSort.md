title: mergeSort
name: lebedevhh     
Date: 3/16/2023
Description: sort array with merge sort algo ; https://youtu.be/bOk35XmHPKs


```java

public static void sort(int[] arr){
    int len=arr.length;
    if (len <2){
        return;
    }
    int mid=len/2;
    int[] larr=new int[mid];
    int[] rarr=new int[len-mid];
    for (int i=0; i < mid; i++){
        larr[i]=arr[i];
    }
    for (int i=mid; i < len; i++){
        rarr[i-mid]=arr[i];
    }
    sort(rarr);
    sort(larr);
    merge(arr, rarr, larr);
}
public static void merge(int[] arr, int[] rightarr, int[] leftarr){
    int rsize=rightarr.length;
    int lsize=leftarr.length;
    int k = 0, j=0, i=0;
    while(i < lsize && j < rsize){
        if (left[i] <= rightarr[j]){
            arr[k]=leftarr[i];
            ++i;
        }
        else{
            arr[k]=rightarr[j];
            ++j;
        }
        ++k;
    }
    while (i < lsize){
        arr[k]=leftarr[i];
        ++i;
        ++k;
    }
    while (j < rsize){
        arr[k]=leftarr[i];
        ++j;
        ++k;
    }
}


```