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
		    int P=sc.nextInt();
		    if((3*X)-(N-X)>=P){
		        System.out.println("PASS");
		    }
		    else{
		        System.out.println("FAIL");
		    }
		}

	}
}
