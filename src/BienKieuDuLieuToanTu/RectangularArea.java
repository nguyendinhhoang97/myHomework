package BienKieuDuLieuToanTu;

import java.util.Locale;
import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner scanner;
        scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("enter height =:");
        height = scanner.nextFloat();
        System.out.print("enter width =:");
        width = scanner.nextFloat();
        float area =height*width;
        System.out.println("rectangular area =:"+area);

    }
}
