import java.io.*;
import java.util.*;

public class parallellogram {

    // Write your code here
    static int B, H, area;
    static boolean flag;
    static {
        Scanner obj = new Scanner(System.in);
        B = obj.nextInt();
        H = obj.nextInt();
        if (B < 0 || H < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
        obj.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
