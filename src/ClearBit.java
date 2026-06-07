import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number to Clear Bit");
        int n = input.nextInt();
        System.out.println("Enter the Position for bit");
        int i = input.nextInt();
        int bitmask = 1<<i;
        
        int num = (n & (~(bitmask)));
        System.out.println(num);
        input.close();
    }
}
