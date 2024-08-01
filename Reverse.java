public class Reverse {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse(n));
    }

    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return rev;
    }
}
