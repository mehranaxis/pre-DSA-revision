public class XpowerN {
    static int power(int x, int n){
        if(n == 0 ){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int ans = x * power(x, n-1);
        return ans;

    }
    public static void main(String[] args) {
       int num =  power(7, 4);
       System.out.println(num);
    }
}
