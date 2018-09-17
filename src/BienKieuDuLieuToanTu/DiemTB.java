package BienKieuDuLieuToanTu;

import java.util.Locale;
import java.util.Scanner;

public class DiemTB {
    public static void main(String[] args) {
        float vatly;
        float hoahoc;
        float sinhhoc;
        float tb;
        float tong;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nhập điểm Lý :");
        vatly = scanner.nextFloat();
        System.out.print("Nhập điểm Hóa :");
        hoahoc = scanner.nextFloat();
        System.out.print("Nhập điểm Sinh :");
        sinhhoc = scanner.nextFloat();
        tb = ((vatly + hoahoc + sinhhoc) / 3);
        System.out.println("Điểm TB của bạn là :" + tb);
        tong = (vatly + hoahoc + sinhhoc);
        System.out.println("Tổng điểm của bạn là :" + tong);

    }
}
