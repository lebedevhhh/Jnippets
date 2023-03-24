// CREDIT TO : sakshamkaushiik || https://leetcode.com/problems/longest-common-prefix/solutions/3174307/well-explained-code-using-strings-in-java/
public class problem14{
    public static void main(String[] args){
        String[] arr={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        //the longest word will get sorted last and the shortest word will get sorted first
        //so by comparing the last and the first word we will surely find the longest common prefix...
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(Character(s1.charAt(idx)).equals(s2.charAt(idx))){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}