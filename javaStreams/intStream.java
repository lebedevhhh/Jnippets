import java.util.Arrays;
import java.util.stream.IntStream;

public class intStream{
    public static void main(String[] args){
        //generate a list of integer from 1 - 200
        int[] n = IntStream.rangeClosed(1,200).toArray();
        System.out.println(Arrays.toString(n));
        //create a new array containing all the multiples of 3 
        int[] z = IntStream.rangeClosed(1,200).filter(a -> a%3==0).toArray();
        System.out.println(Arrays.toString(z));
    }
}