import java.util.Scanner;

public class fitness {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            System.out.println(2 * X * 5);
        }
    }
}