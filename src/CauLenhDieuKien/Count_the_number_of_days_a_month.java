package CauLenhDieuKien;

import java.util.Locale;
import java.util.Scanner;

public class Count_the_number_of_days_a_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int year;
        boolean isLeapYear = false;
        System.out.print("Enter the year to be calculated:");
        year = scanner.nextInt();
        int month;
        int daysInMonth;
        System.out.print("Input month which need check:");
        month = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        while ((month > 12) || (month < 1)) {
            System.out.println("Invalid input,please again");
            month = scanner.nextInt();
        }

            switch (month) {
            case 2:
                if (isLeapYear) {
                    daysInMonth = 29;
                } else
                    daysInMonth = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            default:
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
        }
            System.out.printf("The month %d/%d has %d days!", month, year, daysInMonth);
            }

    }

