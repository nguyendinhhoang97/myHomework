package Caulenhlap;

public class ThietkeMenu {

    public static void main(String[] args) {

        int choice = -1;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Draw the triangle");
            System.out.println("2.Draw the square");
            System.out.println("3.Draw the rectangle");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The triangle");
                    System.out.println("    *");
                    System.out.println("   ***");
                    System.out.println("  *****");
                    System.out.println(" *******");
                    System.out.println("*********");
                    break;
                case 2:
                    System.out.println("The square");
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    break;
                case 3:
                    System.out.println("The rectangle");
                    System.out.println("***********");
                    System.out.println("***********");
                    System.out.println("***********");
                    System.out.println("***********");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Error! Choose again!");

            }

        }
    }
}
