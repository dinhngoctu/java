import java.io.InputStream;
import java.util.Scanner;

public class CalculateLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien vay");
        float loanAmount = scanner.nextFloat();
        System.out.println("Nhap lai suat : ");
        float interest = scanner.nextFloat();
        System.out.println("Nhap thoi han vay: ");
        int loanTime = scanner.nextInt();
        float sum = (loanAmount * interest / 12) * (loanTime * 12) + loanAmount;
        System.out.println("Tong tien sau khi cho vay: " + sum);
    }
}
