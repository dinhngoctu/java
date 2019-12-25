import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array:");
        int size = sc.nextInt();
        sc.nextLine();
        String[] array = new String[size];
        System.out.println("Input element to array by index:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextLine();
        }
        System.out.println("Input the element need find in array: ");
        String input_name = sc.nextLine();dang
        for (int i = 0; i < array.length; i++) {
            if (input_name.equals(array[i])) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(input_name);
    }
}
