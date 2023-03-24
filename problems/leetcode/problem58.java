//credit to Knickon : https://leetcode.com/problems/length-of-last-word/solutions/3307828/java-solution/
public class problem58 {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        return words[words.length-1].length();
    }
    public static int lengthOfLastWordWithoutVanilla(String s){
        int counter=0;
        for (int i = s.length()-1; i >=0; i--){
            if (s.charAt(i) != ' '){
                counter++;
            }
            else if (counter != 0 && s.charAt(i) == ' '){
                return counter;
            }
        }
        return counter;
    }
}
