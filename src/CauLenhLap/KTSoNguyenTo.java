package CauLenhLap;

import java.util.Scanner;

public class KTSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Chương trình tìm số nguyên tố");
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        x = scanner.nextInt();
        if (x < 2)
            System.out.println(x + " không phải số nguyên tố");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(x)) {
                if (x % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check == true)
                System.out.println(x + " là số nguyên tố");
            else
                System.out.println(x + " không là số nguyên tố");
        }
    }
}
