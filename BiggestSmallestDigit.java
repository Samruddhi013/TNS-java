public class BiggestSmallestDigit {
    public static void main(String[] args) {
        System.out.println(biggestDigit(123));
        System.out.println(smallestDigit(123));
    }
    static int biggestDigit(int n){
        int max = 0;
        while(n>0){
            int d = n%10;
            if(d>max){
                max = d;
            }
            n /= 10;
        }
        return max;
    }

    static int smallestDigit(int n){
        int min = 9;
        while(n>0){
            int d = n%10;
            if(d<min){
                min = d;
            }
            n /= 10;
        }
        return min;
    }
}
