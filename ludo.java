import java.util.*;
import java.lang.*;
import java.io.*;

class ludo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            if (X == 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();

	}
}