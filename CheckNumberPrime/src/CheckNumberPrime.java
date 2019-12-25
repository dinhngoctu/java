import java.util.Scanner;
import java.io.InputStream;

public class CheckNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.print(num + " is not a prime");
        } else {
            int i = 2;
            boolean status = true;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime");
                    status = false;
                    break;
                } else {
                    status = true;
                }
            }
            if (status) {
                System.out.println(num + " is a prime");
            }
        }
    }
}
