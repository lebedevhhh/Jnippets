import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class twosum {

    public static void main(String[] args){
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        for (int i=0; i < nums.length; i++){ 
            Integer cidx=map.get(nums[i]);
            if (cidx != null){
                return new int[]{i, cidx};
            }            
            map.put(target-nums[i], i);
        }
        return nums;
    }
}