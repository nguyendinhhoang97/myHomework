package BienKieuDuLieuToanTu;

import java.util.Locale;
import java.util.Scanner;

public class Change_celsius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        float C;
        float F;
        System.out.print("Nhập độ C:");
        C = scanner.nextFloat();
        F = (9*C/5) + 32;
        System.out.println("Đổi ra độ F =:"+F);

    }
}
