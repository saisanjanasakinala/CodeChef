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
		    int N=sc.nextInt();
		    int X=sc.nextInt();
		    if(N<=X){
		        System.out.println("0");
		    }
		    else{
		        int ans=N-X;
		        System.out.println((ans+3)/4);
		    }
		}

	}
}
