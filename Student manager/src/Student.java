import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String name = "Dinh Ngoc A";
    private int age = 0;
    private String sex = "MALE";
    private String msv = "MSV000";
    public int index = 0;
    public int searchValue = 0;

    public Student() {
    }

    public Student(String name, String msv, String sex, int age) {
        this.name = name;
        this.msv = msv;
        this.sex = sex;
        this.age = age;
        StudentManager.myList.add(this);
        this.index = StudentManager.myList.size();
    }

    void editInformationStudent() {
        System.out.println("Nhap ma sinh vien");
        this.msv = (sc.nextLine()).toUpperCase();
        System.out.println("Nhap ten sinh vien");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh");
        this.sex = (sc.nextLine()).toUpperCase();
        System.out.println(toString());
    }


    void searchAge(String str) {
        if (this.age == Integer.parseInt(str)) {
            System.out.println(this);
        }

    }

    void searchSex(String str) {
        String str1 = this.sex;
        if (str.equalsIgnoreCase(str1)) {
            System.out.println(this);
        }
    }

    void searchName(String str) {
        String[] arrStr = str.split(" ");
        String[] arrName = this.name.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrName.length; j++) {
                if (arrStr[i].equalsIgnoreCase(arrName[j])) {
                    searchValue++;
                }
            }
        }
    }

    void searchMSV(String str) {
        if (str.equalsIgnoreCase(this.msv)) {
            System.out.println(this);
        }
    }

    void setIndexDecrease() {
        this.index -= 1;
    }

    void setIndexIncrease() {
        this.index += 1;
    }

    void setDefault() {
        this.searchValue = 0;
    }

    @Override
    public String toString() {
        return "Index: " + index + ", Name: " + name + ", MSV: " + msv + ", Age: " + age + ", Sex: " + sex;
    }
}
