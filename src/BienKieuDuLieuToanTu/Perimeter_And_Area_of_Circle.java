package BienKieuDuLieuToanTu;

import java.util.Locale;
import java.util.Scanner;

public class Perimeter_And_Area_of_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        final double PI = 3.14;
        float BK;
        double Perimeter;
        double Area;
        System.out.print("Nhập bán kính:");
        BK = scanner.nextFloat();
        Perimeter = 2 * BK * PI;
        Area = PI * BK * BK;
        System.out.println("Chu vi và diện tích hình tròn lần lượt là =:" + Perimeter + " và " + Area);
    }
}
