public class Fibbonacci {
    static void fibb(int a, int b,int n){
        if (n == 0){
            return;
        }

        int nextterm = a + b;
        System.out.print(nextterm + " ");
        fibb(b, nextterm, n-1);
    }
    public static void main(String[] args) {
        System.out.print("0 1 ");
        fibb(0,1, 5);
    }
}
