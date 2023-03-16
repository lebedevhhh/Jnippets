import java.util.Scanner;

public class A977{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Solver s = new Solver();
    }
    static class Solver{
        Solver (){
            int n= sc.nextInt();
            String[] arr = sc.next().split("");
            int c1=0;
            int c2=0;
            for (String s: arr){
                if (s.equals("A")){
                    c1++;
                }
                else{
                    c2++;
                }
            }
            if (c1>c2){
                System.out.println("ANTON");
            }
            else if (c1 < c2){
                System.out.println("DANIK");
            }
            else{
                System.out.println("Friendship");
            }
        }
    }
}