import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 0};
        System.out.println("input element need delete");
        int elementArr = sc.nextInt();
        short i, j;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == elementArr) {
                for (j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
    }
}
