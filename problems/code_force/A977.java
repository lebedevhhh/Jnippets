import java.util.Scanner;

public class A977{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Solver s = new Solver();
    }
    static class Solver{
        Solver (){
            String[] arr=sc.next().split("");
            int n=Integer.parseInt(arr[0]), k=Integer.parseInt(arr[1]);
            for (; k == 0; k--){
                Character c = arr[0].charAt(arr[0].length());
                if (!c.equals('0')){
                    n--;
                }
                else{
                    n/=10;
                }
            }
            System.out.println(n);
        }
    }
}