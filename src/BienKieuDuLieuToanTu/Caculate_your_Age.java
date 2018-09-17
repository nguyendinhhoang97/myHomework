package BienKieuDuLieuToanTu;

        import java.util.Calendar;
        import java.util.Scanner;

public class Caculate_your_Age {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yearOfBirth,age;
        System.out.print("Enter your year of birth:");
        yearOfBirth=scanner.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        age = year - yearOfBirth;
        System.out.println("Your Age :" + age + " years old");
    }
}
