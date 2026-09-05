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
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    if( (A!=X) &&  (B!=Y) && (A!=Y) &&  (B!=X)){
		        System.out.println(2);
		    }
		    else if((A==X) &&  (B!=Y) || (A==Y) &&  (B!=X)){
		        System.out.println(1);
		    }
		    else if((A!=X) &&  (B==Y) || (A!=Y) &&  (B==X)){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		}

	}
}
