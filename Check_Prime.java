import java.util.Scanner;

public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number :");
        int num = sc.nextInt();
        int check = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                check++;
            }
        }
        if (check == 2) {
            System.out.println("It is prime ");
        } else {
            System.out.println("It is not prime");
        }

    }
}
