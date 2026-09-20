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
		    int A1=sc.nextInt();
		    int A2=sc.nextInt();
		    int A3=sc.nextInt();
		    int B1=sc.nextInt();
		    int B2=sc.nextInt();
		    int B3=sc.nextInt();
		    int alice=A1+A2+A3-Math.min(A1,Math.min(A2,A3));
		    int bob=B1+B2+B3-Math.min(B1,Math.min(B2,B3));
		    if(alice>bob){
		        System.out.println("Alice");
		    }
		    else if(alice<bob){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Tie");
		    }

		}

	}
}
