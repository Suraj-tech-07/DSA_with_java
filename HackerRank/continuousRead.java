import java.util.*;
// import java.util.String;

public class continuousRead {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st = "";
        int i = 1;
        while (obj.hasNext()) {
            st = obj.nextLine();
            System.out.println(i + " " + st);
            i++;
        }
        obj.close();
    }

}
