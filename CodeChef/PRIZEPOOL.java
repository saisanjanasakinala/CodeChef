
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int total = 10 * X + 90 * Y;
            System.out.println(total);
        }

        sc.close();
    }
}