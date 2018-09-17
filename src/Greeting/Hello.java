package Greeting;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String target = args.length > 0 ? args[0] : "World";
        System.out.println("Hello" + target + "!");

        String s = "123456789987654321";
        System.out.println("nhap chuoi");
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        s
        if (s.substring(0, s.length() / 2).equals(new StringBuffer(s.substring(s.length() - (s.length() / 2))).reverse().toString())) {
            System.out.println("Doi xung");
        } else {
            System.out.println("KHONG Doi xung");
        }
    }

}
