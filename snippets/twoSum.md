title: sumDigitsOfNumber.md
name: lebedevhh__
Date: 1/14/2023
Description : sum the digits of a number 


```java
public int[] twoSum(int[] nums, int target){
    Map<Integer, Integer> map = new HashMap<>();
    for (int i=0; i<nums.length; i++){
        Integer n=map.get(i);
        if (n != null){
            return new int[]{i, n};
        }
        map.put(i, target-nums);
    }
}

```