import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static boolean flag;
    static int B, H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

