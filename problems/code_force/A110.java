import java.util.Scanner;

public class A110{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Solver s = new Solver();
    }
    static class Solver{
        Solver (){
            String str = sc.next();
            int counter=0;
            for (String s : str.split("")){
                if (s.equals("4") && s.equals("7")){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}