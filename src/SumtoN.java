public class SumtoN {
     public static int sum;
    public static void printSum(int n){
        if (n == 0){
            System.out.println(sum);
            return ;
        }
        sum = sum + n;
        printSum(n -1);
    }
    public static void main(String[] args) {
        printSum(5);
    }
}
