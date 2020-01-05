import java.util.Scanner;

public class TestYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nam muon kiem tra");
        int year = sc.nextInt();
        String str =" khong la nam nhuan";
        sc.nextLine();
        if ((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) {
            str =" la nam nhuan";
        }
        System.out.println(year+str);
    }
}
