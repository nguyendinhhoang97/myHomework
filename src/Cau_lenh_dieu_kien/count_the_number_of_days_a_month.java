package Cau_lenh_dieu_kien;

import java.util.Locale;
import java.util.Scanner;

public class count_the_number_of_days_a_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int month;
        String daysInMonth;
        System.out.print("Input month which need check:");
        month = scanner.nextInt();
        switch (month){
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";

        }
        if (daysInMonth != "")
            System.out.printf("The month %d has %s days!",month,daysInMonth);
        else
            System.out.println("Invalid input");
    }
}
