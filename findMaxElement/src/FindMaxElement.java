import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("input array length: ");
        short size = sc.nextShort();
        sc.nextLine();
        arr = new int[size];
        System.out.println("Input int element of array by index: ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index: " + i);
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max_value of array: "+max);
    }
}
