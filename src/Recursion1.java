public class Recursion1 {
    public static void printnum(int num){
        if (num > 5){
            return;
        }
        System.out.println(num);
        printnum(num + 1 );
    }
    public static void main(String[] args) {
        printnum(1);
    }
}
