import java.util.*;
import java.lang.*;
import java.io.*;

class ontimetimely
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            if (X >= 30) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

	}
}