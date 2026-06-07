import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you number to Get Bit");
        int n = input.nextInt();
        System.out.println("Enter the position to Set Bit");
        int i = input.nextInt();
        int bitMask = 1<<i;
        int num = bitMask | n;
        System.out.println(num);
        input.close();
    }
}
