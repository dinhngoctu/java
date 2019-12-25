import java.io.InputStream;
import java.util.Scanner;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri max");
        int num = sc.nextInt();
        while (num < 1) {
            System.out.println("Nhap lai gia tri: ");
            num = sc.nextInt();
        }
        if (num == 1) {
            System.out.println(num);
        } else {
            for (; num > 0; num--) {
                boolean status = true;
                for (int i = num - 1; i > 1; i--) {
                    if (num % i == 0) {
                        status = false;
                        break;
                    }
            }
                if (status) {
                    System.out.print(num+" ");
                }
            }
        }
    }
}