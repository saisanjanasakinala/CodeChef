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
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    if((A<B) && (A<C)){
		        System.out.println(B+C);
		    }
		    else if((B<A) && (B<C)){
		        System.out.println(A+C);
		    }
		    else{
		        System.out.println(A+B);
		    }
		}

	}
}
