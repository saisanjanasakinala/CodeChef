import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		     int[] arr = new int[3];
    		    arr[0] = sc.nextInt();
    		    arr[1] = sc.nextInt();
    		    arr[2] = sc.nextInt();
    		    
    		    
    		    Arrays.sort(arr);
    		    
    		    
    		    System.out.println(arr[1]);
		   
		}

	}
}
