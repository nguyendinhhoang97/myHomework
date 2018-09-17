package CauLenhDieuKien;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year to be calculated:");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
