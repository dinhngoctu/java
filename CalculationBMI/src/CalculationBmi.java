import java.util.Scanner;

public class CalculationBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your weight:");
        double weight = sc.nextDouble();
        System.out.println("input your height:");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        String str = "";
        if (bmi < 18.5) {
            str = " Underweight";
        } else {
            if (bmi < 25) {
                str = " Norman";
            } else {
                if (bmi < 30) {
                    str = " Overweight";
                } else {
                    if (bmi >= 30) {
                        str = " Obese";
                    }
                }
            }
        }
        System.out.println("Your bmi is: " + bmi + "," + str+".");
    }
}
