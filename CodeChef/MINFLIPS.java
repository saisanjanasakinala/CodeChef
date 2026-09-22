import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int sum = 0;

            for (int i = 0; i < N; i++) {
                sum += sc.nextInt();
            }

            if (N % 2 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(Math.abs(sum) / 2);
            }
        }

        sc.close();
    }
}