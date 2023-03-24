import javax.crypto.SealedObject;

public class problem35 {
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,7,8};
        System.out.println(searchInsert(arr, 9));
    }
    public static int searchInsert(int[] nums, int target) {
        //use the binary search algo
        int lp=0;
        int rp=nums.length-1;
        while (lp <= rp){
            int mid = (rp + lp) / 2;
            if (nums[mid]==target) return mid;
            if (nums[mid] > target){
                rp=mid;
                rp++;
            }
            if (nums[mid] < target){
                lp=mid;
                lp++;
            }
        }
        return lp;
    }
}
