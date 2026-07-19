import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNextLine()) {
            String Line = sc.nextLine();
            System.out.printf("%d %s\n", i, Line);
            i++;
        }
    }
}
