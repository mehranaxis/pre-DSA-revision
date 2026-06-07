
import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number to Update Bit");
        int n = input.nextInt();
        System.out.println("Enter the Position for bit");
        int i = input.nextInt();
        System.out.println("0 or 1 ?");
        int x = input.nextInt();

        int bitmask = 1<<i;
        switch (x) {
            case 0:{
                int num = (n & (~bitmask));
                System.out.println(num);
            }
                break;
            case 1: {
                int num = (bitmask | n);
                System.out.println(num);
            }
                break;
            default:{
                System.out.println("only Choose Between 0 and 1");
            }
                break;
        }
        input.close();
    }
}
