//credit : https://leetcode.com/problems/plus-one/solutions/2706861/java-fastest-0ms-runtime-easy-and-elegant-solution/ 

import java.util.Arrays;

public class problem66 {
    public static void main(String[] args){
        int[] arr={5,9,9};
        // plusOneFaster(arr);
        System.out.println(Arrays.toString(plusOneFaster(arr)));
        // System.out.println(Arrays.toString(plusOne(arr)));
    }

    //O(2n)
    public static int[] plusOne(int[] digits) {
        int sum=0;
        for (int i=0; i<digits.length; i++){
            sum += digits[i] * Math.pow(10, digits.length - 1 - i);
        }
        sum ++;
        for(int i=digits.length-1; i >= 0 ; i--){
            digits[i]=sum % 10;
            sum /=10;
            System.out.println(sum);
        }
        return digits;
    }

    //O(n) time complexity
    public static int[] plusOneFaster(int[] d){
        for (int i=d.length-1; i>=0; i--){
            if (d[i] < 9){
                d[i]++;
                return d;
            }
            else{
                d[i]=0;
            }
        }
        d = new int[d.length+1];
        d[0]=1;
        return d;
    }
}
