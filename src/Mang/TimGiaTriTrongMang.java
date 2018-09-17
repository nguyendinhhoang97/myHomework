package Mang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String input_name = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position's " + input_name + "in the lis is: " + (i + 1));
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("Not Found " + input_name + "in the list");

        }
    }
}