import java.util.HashMap;
import java.util.Map;

class romanToInt{
    public static void main(String[] args){
        System.out.println(solve("III"));
    }
    //solution from : Narendra_Singh_
    public static int solve(String s) {
        Map<String, Integer> map=new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);   
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        for(int i=0;i<s.length();i++){
            sum = sum + (map.get(s.charAt(i)));
        }
        return sum;
    }
}