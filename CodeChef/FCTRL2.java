import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger; // 1. Import BigInteger

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		    int n = sc.nextInt();
		    
		    // 2. Use BigInteger instead of int to prevent overflow
		    BigInteger fact = BigInteger.ONE;
		    
		    for (int i = 1; i <= n; i++) {
		        // 3. Use .multiply() for BigInteger multiplication
		        fact = fact.multiply(BigInteger.valueOf(i));
		    }
		    
		    System.out.println(fact);
		}
		sc.close();
	}
}