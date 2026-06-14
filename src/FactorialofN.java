// public class FactorialofN {
    
//     static void factorial(int n, int fact){
//         if (n==1) {
//             System.out.println(fact);
//             return;
//         }
//         fact = fact * n;
//         factorial((n-1), fact);
//     }
//     public static void main(String[] args) {
//         int a;
//         factorial(4, 1);

//     }
// }

public class FactorialofN {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}