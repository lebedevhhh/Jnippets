public class problem70{
    public static void main(String[] args){
        int n=4;
        System.out.println(climbStairs(4));
    }

    //choose any size 
    private static long[] cache=new long[100];
    //this ressembles heavily with the fibonnaci sequence
    //we're going to use the memoization for speeding the algo
    public static int climbStairs(int n) {
        if(n==0){return 0;}
        if (n==1){
            return 1;
        }
        if (cache[n] !=0){
            return (int) cache[n];
        }
        int nth=climbStairs(n-1)+climbStairs(n-2);
        cache[n]=nth;
        return nth;
    }
}