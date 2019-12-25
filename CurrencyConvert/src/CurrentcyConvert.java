import java.util.Scanner;
import java.io.InputStream;

public class CurrentcyConvert {
    public static void main(String[] args) {
        float a = 1;
        float b = 1;
        Scanner scanner = new Scanner(System.in);
        int inNumber = 1;
        while (inNumber != 0) {
            System.out.println("**********");
            System.out.println("Tien dong la 1");
            System.out.println("Tien USD la 2");
            System.out.println("Nhap loai tien can chuyen");
            inNumber = scanner.nextInt();
            switch (inNumber) {
                case 1:
                    a = 1;
                    break;
                case 2:
                    a = 23000;
                    break;
            }
            System.out.println("Nhap so tien can chuyen sang");
            float amount = scanner.nextFloat();
            System.out.println("Nhap loai tien can chuyen sang");
            int outNumber = scanner.nextInt();
            switch (outNumber) {
                case 1:
                    b = 1;
                    break;
                case 2:
                    b = 23000;
                    break;
            }
            float convertNumber = amount * a / b;
            System.out.println("so tien la " + convertNumber);
        }
    }
}
