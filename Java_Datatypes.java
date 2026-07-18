import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long n = sc.nextLong();
                System.out.print(n + " can be fitted in:\n");
                if (n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE) {
                    System.out.println("* byte");
                }
                if (n <= Short.MAX_VALUE && n >= Short.MIN_VALUE) {
                    System.out.println("* short");
                }
                if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
