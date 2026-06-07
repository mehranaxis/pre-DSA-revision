import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        // Question: get the 2nd Position bit for "0101"
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number to Get Bit");
        int n = input.nextInt();
        System.out.println("Enter the Position for bit");
        int i = input.nextInt();
        int bitmask = 1<<i;
        
        if ((bitmask & n) == 0) {
            System.out.println("bit was Zero");
        } else {
            System.out.println("bit was One");
        }

        input.close();
    }
}
