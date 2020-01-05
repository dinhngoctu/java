import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ky tu vao bien c");
        char c = sc.next().charAt(0);
        int n=0;
        String str = new String("dang lam gi day");;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                n++;
            }
        }
        System.out.println(n);
    }
}