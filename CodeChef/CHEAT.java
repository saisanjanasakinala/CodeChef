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
		    if(N<2){
		        System.out.println(0);
		    }
		    else{
		        int ans=(N-2)/7+1;
		        System.out.println(ans);
		    }
		}

	}
}
