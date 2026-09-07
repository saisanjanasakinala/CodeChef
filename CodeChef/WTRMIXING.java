import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (A == B) {
                System.out.println("YES");
            }
            else if (B > A) {
                int needed = B - A;

                if (X >= needed) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            else {
                int needed = A - B;

                if (Y >= needed) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}