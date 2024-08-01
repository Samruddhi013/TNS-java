public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(234));
    }
    static int productOfDigits(int n){
        int sum = 1;
        while(n>0){
            int d = n%10;
            sum = sum*d;
            n /= 10;
        }
        return sum;
    }
}
