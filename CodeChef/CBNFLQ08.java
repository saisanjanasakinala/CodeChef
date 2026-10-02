import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int totalSecondsInput = 7384;

        // Calculate full hours
        int hours=totalSecondsInput/3600;
        int remainingSecondsAfterHours=totalSecondsInput%3600;
        int minutes=remainingSecondsAfterHours/60;
        int seconds=remainingSecondsAfterHours%60;


        // Calculate full minutes from remaining seconds


        // Remaining seconds after extracting minutes


        // Output the result
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

	}
}
