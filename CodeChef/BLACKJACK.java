import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int third = 21 - a - b;

            if (third >= 1 && third <= 10) {
                System.out.println(third);
            } else {
                System.out.println(-1);
            }
        }
    }
}