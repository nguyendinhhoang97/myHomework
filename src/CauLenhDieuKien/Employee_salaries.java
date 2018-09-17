package CauLenhDieuKien;

import java.util.Locale;
import java.util.Scanner;

public class Employee_salaries {
    public static void main(String[] args) {
        float heSoLuong;
        int soNamLamViec;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nhập hệ số lương :");
        heSoLuong = sc.nextFloat();
        System.out.print("Nhập số năm làm việc :");
        soNamLamViec = sc.nextInt();
        if (heSoLuong > 5 || heSoLuong < 0) {
            System.out.println("Hệ số lương phải nằm trong khoảng 1-5");
            heSoLuong = sc.nextFloat();
        }else {
            float luongThang = heSoLuong * 4000000 + soNamLamViec * 500000;
            System.out.print("Lương tháng của bạn là :"+(long)luongThang+"VNĐ");
        }
    }
}
