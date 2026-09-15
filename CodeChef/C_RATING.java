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
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    if(X>=Y){
		        System.out.println(0);
		    }
		    else{
		        System.out.println((Y-X+7)/8);
		    }
		}

	}
}
