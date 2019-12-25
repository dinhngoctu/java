import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        String[] arr1 = {"dang", "lam"};
        String[] arr2 = {"gi", "day"};
        int size3 = arr1.length + arr2.length;
        String[] arr3 = new String[size3];
        int i;
        for (i = 0; i < arr1.length; i++){
            arr3[i]=arr1[i];
        }
        for(int j = 0;j<arr2.length;j++){
            arr3[i]=arr2[j];
            i++;
        }
        for(String element:arr3) {
            System.out.print(element);
        }
        System.out.println("*******");
    }
}
