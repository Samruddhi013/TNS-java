public class DigitSumSingleDigit {
    public static void main(String[] args) {
        System.out.println(digitSumSingleDigit(89));
    }

    static int digitSumSingleDigit(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        if(sum>9)
            return digitSumSingleDigit(sum);
        else
            return sum;
    }
}
