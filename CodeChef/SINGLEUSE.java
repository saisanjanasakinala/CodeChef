import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int H = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    // Remaining health after using the special attack
		    int remainingHealth = H - Y;
		    
		    // Calculate normal attacks needed using ceiling division
		    int normalAttacks = (remainingHealth + X - 1) / X;
		    
		    // Total attacks = 1 (special attack) + normal attacks
		    int ans = 1 + normalAttacks;
		    
		    System.out.println(ans);
		}
	}
}