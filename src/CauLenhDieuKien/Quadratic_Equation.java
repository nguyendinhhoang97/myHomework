package CauLenhDieuKien;

import java.util.Locale;
import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a,b,c,root1,root2,d;
        System.out.println("Program to Find the Roots of Quadratic Equation");
        System.out.println("Quadratic Equation has form 'ax^2 + bx + c = 0', enter your a,b,c : ");
        System.out.print("a=:");
        a = scanner.nextDouble();
        System.out.print("b=:");
        b = scanner.nextDouble();
        System.out.print("c=:");
        c = scanner.nextDouble();
        if (a==0){
            if(b==0){
                if(c==0) {
                    System.out.println("Quadratic Equation has innumerable root");
                }else{
                    System.out.println("Quadratic Equation hasn't root");
                }
            }else
                System.out.println("Quadratic Equation has a root:"+ "x="+ -b/a);
        }else{
            d=b*b-4*a*c;
            if(d>0){
                System.out.println("Roots are real and unequal");
                root1 = ( - b + Math.sqrt(d))/(2*a);
                root2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("First root is x1=:"+root1);
                System.out.println("Second root is x2=:"+root2);
            }else if (d==0){
                System.out.println("Roots are real and equal");
                root1 = (-b+Math.sqrt(d))/(2*a);
                System.out.println("Root:"+root1);
            }else{
                System.out.println("Roots are imaginary");
            }
        }
    }
}
