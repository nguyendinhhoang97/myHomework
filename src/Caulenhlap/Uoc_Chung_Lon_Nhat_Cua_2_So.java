package Caulenhlap;

import java.util.Scanner;

public class Uoc_Chung_Lon_Nhat_Cua_2_So {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = scanner.nextInt();
        System.out.println("Enter second number:");
        b = scanner.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
        }
        System.out.println("Greatest common factor:" + a);
    }
}
