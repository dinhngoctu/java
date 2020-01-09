import java.util.Scanner;

public class NextDayCalculator {

    static int next_month;
    static int next_year;
    static int next_day;
    static final int max_month = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input day need calculate ('dd/mm/year')");
        String day_need_calculate = sc.nextLine();
        String[] arr = day_need_calculate.split("/");
        int present_day = Integer.parseInt(arr[0]);
        int present_month = Integer.parseInt(arr[1]);
        int present_year = Integer.parseInt(arr[2]);
        next_month = present_month;
        next_year = present_year;
        int max_day = calculateMaxDay(present_month, present_year);

        System.out.println(" " + max_day);
        next_day = calculateNextDay(present_day,max_day,present_month);
        System.out.println(" " + next_day + "/" + next_month + "/" + next_year);
    }

    static int calculateNextDay(int present_day, int max_day, int present_month) {
        if (present_day < max_day) {
            next_day = present_day + 1;
        } else if (present_day == max_day) {
            next_day = 1;
            next_month = present_month + 1;
            if (next_month == max_month) {
                next_month = 1;
                next_year += 1;
            }
        }
        return next_day;
    }

    static int calculateMaxDay(int present_month, int present_year) {
        int max_day = 0;
        switch (present_month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                max_day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                max_day = 30;
                break;
        }
        if (present_month == 2) {
            if (isLeapYear(present_year)) {
                max_day = 29;
            } else {
                max_day = 28;
            }
        }
        return max_day;
    }

    static boolean isLeapYear(int present_year) {
        if (present_year % 400 == 0 || present_year % 4 == 0 && present_year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
