package Bien_Kieudulieu_Toantu;

import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter height =:");
        height = scanner.nextFloat();
        System.out.print("enter width =:");
        width = scanner.nextFloat();
        float area =height*width;
        System.out.println("rectangular area =:"+area);

    }
}
