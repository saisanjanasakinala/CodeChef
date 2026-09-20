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
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int R = sc.nextInt();
		    
		    // Calculate total sticks eaten
		    int totalSticks = X + (R / 30);
		    
		    // Calculate total plates using ceiling division: (totalSticks + Y - 1) / Y
		    int plates = (totalSticks + Y - 1) / Y;
		    
		    System.out.println(plates);
		}
	}
}