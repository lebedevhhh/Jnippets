public class problem69 {
    public static void main(String[] args){
        int n=10;
        System.out.println(binSearchSqrt(n));
    }

    public int mySqrt(int x) {
        return (int) x / (x * x);        
    }

    //using the binary search (clever) || https://leetcode.com/problems/sqrtx/solutions/3093338/2-approaches-using-linear-search-and-binary-search/
    public static int binSearchSqrt(int x){
        int low=0, high=x, ans=0;
        while (low <= high){
            int mid=(high+low)/2;
            if (x/mid==mid){
                return mid;
            }
            else if (x/mid < high){
                high=mid;
                high--;
            }
            else {
                low=mid;
                low++;
                ans=mid; //makes sense
            }
        }
        return ans;
    }

}
