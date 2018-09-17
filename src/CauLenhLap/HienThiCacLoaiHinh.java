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
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j <= 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("*");
                    }
            }
        }
    }
}

