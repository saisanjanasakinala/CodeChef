import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int reversedNumber = 0;
                
                // Reverse the digits of n
                while (n > 0) {
                    int digit = n % 10;
                    reversedNumber = reversedNumber * 10 + digit;
                    n /= 10;
                }
                
                // Print the reversed number
                System.out.println(reversedNumber);
            }
        }
        
        scanner.close();
    }
}