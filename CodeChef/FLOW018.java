import java.util.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while(t-- > 0){
                int N = sc.nextInt();
                long factorial = 1;
                
                // Calculate factorial iteratively
                for(int i = 1; i <= N; i++) {
                    factorial *= i;
                }
                
                System.out.println(factorial);
            }
        }
    }
}