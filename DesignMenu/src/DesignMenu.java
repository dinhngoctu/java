import java.io.InputStream;
import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    for (int i = 4; i > 1; i--) {
                        for (int j = i - 1; j > 0; j--) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    System.out.println("*");
                    break;
                case 3:
                    for (int i = 4; i > 0; i--) {
                        for (int j = 4; j > 0; j--) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

