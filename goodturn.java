import java.util.*;
import java.lang.*;
import java.io.*;


class goodturn
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		// write your code here
    		if(x+y>6)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}
		
	}
}
