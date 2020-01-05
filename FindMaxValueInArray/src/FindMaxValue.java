import java.util.Scanner;
public class FindMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input length of array");
        int i = sc.nextInt();
        System.out.println("input length of element");
        int j = sc.nextInt();
        int[][] arr = new int[i][j];
        int n = Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {
            for(int m=0;m<arr[k].length;m++){
                arr[k][m] = sc.nextInt();
                if (n < arr[k][m]) {
                    n = arr[k][m];
                }
            }
        }
        System.out.println(n+" is max Value");
    }
}