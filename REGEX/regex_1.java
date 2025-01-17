package REGEX;

import java.util.regex.*;

public class regex_1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a{3}");
        Matcher matcher = pattern.matcher("aaaaa");
        boolean matchFound = matcher.find();
        System.out.println("Result : " + matchFound);
    }
}
