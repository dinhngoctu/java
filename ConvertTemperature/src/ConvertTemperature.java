import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to fahrenheit");
            System.out.println("0. Exit");
            choice = sc.nextByte();
            int value = sc.nextInt();
            sc.nextLine();
            double result;
            switch (choice) {
                case 1:
                    result = celsiusToFahrenheit(value);
                    System.out.println(result);
                    break;
                case 2:
                    result = fahrenheitToCelsius(value);
                    System.out.println(result);
                    break;
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celcius) {
        double fahrenheit = (9 / 5.0) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * fahrenheit - 32;
        return celsius;
    }
}
