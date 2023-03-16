import java.util.Scanner;

public class A59{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Solver s = new Solver();
    }
    static class Solver{
        Solver (){
            String str = sc.next();
            if (countMin(str) == countMaj(str)){
                System.out.println(str.toLowerCase());
            }
            else if (countMin(str) > countMaj(str)){
                System.out.println(str.toLowerCase());
            }
            else {
                System.out.println(str.toUpperCase());
            }
        }
        static int countMin(String n){
            int a = 0;
            for (char c : n.toCharArray()){
                if (Character.isLowerCase(c)){
                    a++;
                }
            }
            return a;
        }
        static int countMaj(String n){
            int a = 0;
            for (char c : n.toCharArray()){
                if (Character.isUpperCase(c)){
                    a++;
                }
            }
            return a;
        }
    }
}