import java.util.Arrays;
import java.util.Scanner;

public class DaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("nhap chieu dai mang");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        for (int ind = 0; ind < size; ind++) {
            System.out.println("Input element in array by index: " + ind);
            array[ind] = sc.nextInt();
        }
        System.out.println("Elements in array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < array.length/2; i++) {
            int j;
            j=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=j;
        }
        System.out.println();
        System.out.println("Elements in array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
//        }
    }
}
