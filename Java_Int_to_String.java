import java.util.Scanner;

public class Java_Int_to_String {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String s = String.valueOf(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Goodjob!");
        } else System.out.println("WrongAns!");
    }
}
