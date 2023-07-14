import java.util.Scanner;

public class Scannerdemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("%d * %d = %d입니다.\n", x, y, x*y);
    }
}
