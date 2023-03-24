//code from : hridoy100 : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/solutions/3250360/think-as-a-sliding-window-code-like-a-pro-beats-100/

public class problem28 {
    public static void main(String[] args){
        String str="Helloworld", trg="world";
        System.out.println(strStr(str, trg));
    }
    
    public static int strStr(String haystack, String needle) {
        int lenH=haystack.length();
        int lenN=needle.length();
        int nidx=0;
        for (int i=0; i < lenH; i++){
            if (haystack.charAt(i) == needle.charAt(nidx)){
                nidx++;
            }
            else{
                i = i -nidx; //returning to the first index
                System.out.println(nidx);
                nidx=0;
            }
            if (nidx==lenN) return i-lenN+1;
        }        
        return -1;
    }
    
}
