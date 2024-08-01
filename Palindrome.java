public class Palindrome {
    public static void main(String[] args) {
        int a = 12321;
        System.out.println(isPalindrome(a));
    }

    static boolean isPalindrome(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if(sum == temp){
            return true;
        }
        else{
            return false;
        }
    }
}
