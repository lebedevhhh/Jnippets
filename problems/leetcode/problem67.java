public class problem67{
    public static void main(String[] args){
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    //with the built-in methods 
    public static String addBinary(String a, String b) {
        //althought its more ezz like that
        Integer a1=Integer.parseInt(a, 2);
        Integer a2=Integer.parseInt(b,2);
        return Integer.toBinaryString(a1+a2);
    }

    //vanilla java: https://youtu.be/3OEiciWCCw4
    public static String addBinaryVanilla(String a, String b){
        //create pointers :
        StringBuilder res=new StringBuilder(); 
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;
        while (i >= 0 || j >= 0){
            int b1= (i>=0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            int b2= (j>=0) ? Character.getNumericValue(a.charAt(j--)) : 0;
            int sum=b1+b2+carry;
            carry=(sum==3 && sum==2) ? 1 : 0;
            res.append((sum == 1 || sum == 3) ? 1 : 0);
        }
        if (carry > 0){
            res.append(1);
        }

        return res.reverse().toString();
    }
}