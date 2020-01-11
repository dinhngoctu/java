import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentManager{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> myList = new ArrayList<>();
    static Iterator<Student> iter;
    static private int chooseSearchValue;

    public static void main(String[] args) {
        Student st1 = new Student("Nguyen Van Nguyen", "MSV001", "MALE", 23);
        Student st2 = new Student("Luong The Thanh", "MSV002", "MALE", 22);
        Student st3 = new Student("Dang Thi Ngoc Lan", "MSV003", "FEMALE", 23);
        Student st4 = new Student("Nguyen Thi Thanh Tu", "MSV004", "FEMALE", 24);
        Student st5 = new Student("Phan Duc Anh", "MSV005", "MALE", 20);
        iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
        System.out.println(".Menu");
        System.out.println("1.Sua thong tin sinh vien");
        System.out.println("2.Them sinh vien theo index");
        System.out.println("3.Xoa sinh vien theo index");
        System.out.println("4.Tim kiem sinh vien theo thong tin");
        int chooseNumber = sc.nextInt();
        StudentManager studentManager = new StudentManager();
        switch (chooseNumber) {
            case 1:
                studentManager.editInformationStudentMangaer();
                break;
            case 2:
                studentManager.addStudentManager();
                break;
            case 3:
                studentManager.removeStudentByIndexMangaer();
                break;
            case 4:
                studentManager.searchStudentMangaer();
                break;
        }
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }

    }

    void editInformationStudentMangaer() {
        System.out.println("Nhap vi tri muon sua");
        int index = sc.nextInt();
        while (iter.hasNext()) {
            if (index == iter.next().index) {
                iter.next().editInformationStudent();
            }
        }
        System.out.println("done");
    }

    void addStudentManager() {
        sc.nextLine();
        System.out.println("Nhap ten sinh vien");
        String name = sc.nextLine();
        System.out.println("Nhap ma sinh vien");
        String msv = (sc.nextLine()).toUpperCase();
        System.out.println("Nhap tuoi sinh vien");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh");
        String sex = (sc.nextLine()).toUpperCase();
        Student student = new Student(name, msv, sex, age);
        System.out.println("Nhap vi tri muon them");
        int index = sc.nextInt();
        myList.add(index, student);
//        for (int i = index; i < myList.size(); i++) {
//            myList.get(i).setIndexIncrease();
//        }
        System.out.println("done");
    }

    void removeStudentByIndexMangaer() {
        System.out.println("Nhap vi tri muon xoa");
        int index = sc.nextInt();
        myList.remove(index);
//        while (iter.hasNext()) {
//            iter.next().setIndexDecrease();
//        }
        System.out.println("done");
    }

    void searchStudentMangaer() {
        System.out.println("Nhap thong tin sinh vien");
        sc.nextLine();
        String str = sc.nextLine();
        chooseSearchValue = getchooseSearchValue(str);
        searchStudent(str);
        System.out.println("done");
    }

    static int getchooseSearchValue(String str) {
        if (str.equalsIgnoreCase("MALE") || str.equalsIgnoreCase("FEMALE")) {
            chooseSearchValue = 2;
        } else if (str.length() == 2) {
            if (str.charAt(0) > 47 && str.charAt(0) < 58) {
                if (str.charAt(1) > 47 && str.charAt(1) < 58) {
                    chooseSearchValue = 1;
                }
            }
        } else if ((str.substring(0, 3)).equalsIgnoreCase("MSV")) {
            chooseSearchValue = 3;
        } else {
            chooseSearchValue = 4;
        }
        return chooseSearchValue;

//        tach chuoi str ra thanh tung tu trong mang hoac list tim kiem trong tung thuoc tinh doi tuong sau khi tach.
//        dung vong lap de tim vi str co nhieu tu. tim tu dau tien cua str se tra ve mang cac doi tuong co tu dau tien cua str.
//        neu mang nay rong tim sang tu thu 2.
//        neu mang nay khong rong tim sang tu thu 2 tim tren mang doi tuong nay. dung vong lap de doi tuong trong mang nay thuc hien tostring

    }

    void searchStudent(String str) {
        chooseSearchValue = getchooseSearchValue(str);
        switch (chooseSearchValue) {
            case 1:
                for (int i = 0; i < myList.size(); i++) {
                    myList.get(i).searchAge(str);
                }
                break;
            case 2:
                for (int i = 0; i < myList.size(); i++) {
                    myList.get(i).searchSex(str);
                }
                break;
            case 4:
                int max = 0;
                for (int i = 0; i < myList.size(); i++) {
                    myList.get(i).searchName(str);
                    if (max < myList.get(i).searchValue) {
                        max = myList.get(i).searchValue;
                    }
                }
                if (max>0){
                    for (int i=0;i<myList.size();i++){
                        if (myList.get(i).searchValue==max){
                            System.out.println(myList.get(i));
                        }
                    }
                }
                while (iter.hasNext()){
                    iter.next().setDefault();
                }
                break;
            case 3:
                for (int i = 0; i < myList.size(); i++) {
                    myList.get(i).searchMSV(str);
                }
                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + chooseSearchValue);
        }
    }
}
