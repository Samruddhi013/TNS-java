public class ArmstrongNo {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum = sum+(d*d*d);
            n /=10;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
}
