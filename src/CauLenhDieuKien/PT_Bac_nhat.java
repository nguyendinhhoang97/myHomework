package CauLenhDieuKien;

import java.util.Locale;
import java.util.Scanner;

public class PT_Bac_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a,b;
        System.out.println("Giải PT bậc nhất");
        System.out.println("PT có dạng 'ax + b = 0', hãy nhập a và b");
        System.out.print("a=:");
        a = scanner.nextDouble();
        System.out.print("b=:");
        b = scanner.nextDouble();
        if(a==0){
            if(b==0) {
                System.out.println("PT vô số nghiệm");
            }else{
                System.out.println("PT vô nghiệm");
            }
        }else
            System.out.println("PT có nghiệm là:"+ "x="+ -b/a);
    }
}
