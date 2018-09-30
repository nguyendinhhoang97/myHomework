package CauLenhLap;

public class HienThiCacLoaiHinh {

    public static void main(String[] args) {

        int choice = -1;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Draw the triangle");
            System.out.println("2.Draw the square");
            System.out.println("3.Draw the rectangle");
            System.out.println("0.Exit");
            System.out.print("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 3:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 4; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 1:
                    int number = 1;
                    while (number <= 5) {
                        for (int i = 1; i <= number; i++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                        number++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
