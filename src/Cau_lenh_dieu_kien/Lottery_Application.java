package Cau_lenh_dieu_kien;

import java.util.Random;
import java.util.Scanner;

public class Lottery_Application {
    public static void main(String[] args) {
        /*Random random = new Random();
        int n = random.nextInt(90) + 10;*/
        int luckyNumber1 = 3;
        int luckyNumber2 = 5;
        int guessNumber1,guessNumber2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first lucky number:");
        guessNumber1 = scanner.nextInt();
        System.out.print("Enter your second lucky number:");
        guessNumber2 = scanner.nextInt();
        if(guessNumber1==luckyNumber1 && guessNumber2==luckyNumber2){
            System.out.println("Congratulate! Your reward is $10000");
        }else if(guessNumber1==luckyNumber2 && guessNumber2==luckyNumber1){
            System.out.println("Congratulate! Your reward is $3000");
        }else if(guessNumber1==luckyNumber1 || guessNumber2==luckyNumber2){
            System.out.println("Congratulate! Your reward is $1000");
        }else
            System.out.println("Wish you luck next time");
    }
}
//