class palindromNumber {

    public static void main(String[] args){
        int i = 97843489;
        System.out.println(isPalindrome(i));
    }

    public static boolean isPalindrome(int x) {
        int reverse=0;
        int temp=x;
        while (temp != 0){
            reverse= reverse*10 + temp %10;
            temp/=10; 
        }
        return x == temp ? true : false;
    }
}