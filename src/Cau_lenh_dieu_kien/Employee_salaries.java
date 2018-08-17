package Cau_lenh_dieu_kien;

import java.util.Locale;
import java.util.Scanner;

public class Employee_salaries {
    public static void main(String[] args) {
        float heSoLuong;
        int soNamLamViec;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập hệ số lương :");
        heSoLuong = sc.nextFloat();
        System.out.println("Nhập số năm làm việc :");
        soNamLamViec = sc.nextInt();
        if (heSoLuong > 5 || heSoLuong < 0) {
            System.out.println("Hệ số lương phải nằm trong khoảng 1-5");
            heSoLuong = sc.nextFloat();
        }else {
            float luongThang = heSoLuong * 4000000 + soNamLamViec * 500000;
            System.out.println("Lương tháng của bạn là : " + luongThang);
        }
    }
}
