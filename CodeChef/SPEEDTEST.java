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
		    int X=sc.nextInt();
		    int B=sc.nextInt();
		    int Y=sc.nextInt();
		    if(A*Y>B*X){
		        System.out.println("Alice");
		    }
		    else if(A*Y<B*X){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Equal");
		    }
		}

	}
}
