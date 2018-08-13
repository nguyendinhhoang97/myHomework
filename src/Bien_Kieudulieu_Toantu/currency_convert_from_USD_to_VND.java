package Bien_Kieudulieu_Toantu;

import java.util.Locale;
import java.util.Scanner;

public class currency_convert_from_USD_to_VND {
    public static void main(String[] args) {
        double usd;
        double vnd=23000;
        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nhập số USD cần đổi:" );
        usd=scanner.nextDouble();
        double quydoi=usd*vnd;
        System.out.println("Số tiền đổi ra la:"+ quydoi +" VND");
    }
}
