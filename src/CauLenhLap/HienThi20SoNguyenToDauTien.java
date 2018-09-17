package CauLenhLap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int count = 0;
        int i = 2;
        while (count < 20) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }


    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
