import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number :");
        int dec = sc.nextInt();
        int temp = dec;
        String bin = " ";
        while (temp > 0) {
            int n = temp % 2;
            temp = temp / 2;
            bin = n + bin;
        }
        System.out.println("Binary Number of " + dec + " is :" + bin);
    }
}
