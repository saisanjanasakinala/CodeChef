import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int x = scanner.nextInt();
                
                // Apply discount rules
                if (x <= 100) {
                    System.out.println(x);
                } else if (x <= 1000) {
                    System.out.println(x - 25);
                } else if (x <= 5000) {
                    System.out.println(x - 100);
                } else {
                    System.out.println(x - 500);
                }
            }
        }
        
        scanner.close();
    }
}