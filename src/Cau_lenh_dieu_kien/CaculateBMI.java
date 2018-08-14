package Cau_lenh_dieu_kien;

import java.util.Locale;
import java.util.Scanner;

public class CaculateBMI {
    public static void main(String[]args){
        double height,weight,bmi;
        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi=weight/Math.pow(height,2);
        System.out.println("Your BMI = "+bmi);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if (bmi<25.0)
            System.out.println("Normal");
        else if(bmi<30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obse");

        }

}
