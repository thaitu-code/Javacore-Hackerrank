import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                double ans = a;
                for (int j = 0; j <= i; j++) {
                    ans += Math.pow(2, j) * b;
                }
                System.out.print((long) ans + " ");
            }
            System.out.print("\n");
            q--;
        }

    }
}
