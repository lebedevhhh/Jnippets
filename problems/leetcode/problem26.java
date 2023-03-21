import java.util.Arrays;

public class problem26 {
    public static void main(String[] args){
        int[] arr={1,1,2,4,4,6,7,8};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i =0; i < nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                continue;
            }
            else {
                //swap 
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return j;
    }
}
