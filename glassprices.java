import java.util.*;
import java.lang.*;
import java.io.*;

class glassprices
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here  
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y<=2*x)
        System.out.println("METAL");
        else
        System.out.println("PLASTIC");
	}
}
