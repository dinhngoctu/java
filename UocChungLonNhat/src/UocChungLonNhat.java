import java.io.InputStream;
import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b, c;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap so a ");
        a = nhap.nextInt();
        System.out.println("nhap so b ");
        b = nhap.nextInt();
        for (c = a; c > 0; c--) {
            if ((a % c == 0) && (b % c == 0)) {
                System.out.println(c + " la uoc so chung lon nhat cua a");
                break;
            }
        }
    }
}