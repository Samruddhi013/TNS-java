public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        getFactorial(n);
        int ans = getFactRecursive(n);
        System.out.println(ans);
    }

    static void getFactorial(int n){
         int sum = 1;
         for(int i=n;i>0;i--){
            sum *= i;
         }
         System.out.println(sum);
    }

    static int getFactRecursive(int n){
        if(n>0){
            return n* getFactRecursive(n-1);
        }
        else{
            return 1;
        }
    }
}
