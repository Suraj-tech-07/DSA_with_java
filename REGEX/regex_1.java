package REGEX;

import java.util.regex.*;

public class regex_1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a{3,8}");
        Matcher matcher = pattern.matcher("aaaaaaaaaa");
        boolean matchFound = matcher.find();
        System.out.println("Result : " + matchFound);
    }
}
