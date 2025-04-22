package RegularExp;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Driver {
    public static void main(String[] args) {
        String str = "Adam plucked the apple and gae it to Aaron";
        String s1 = "this is rom";

        String s2 = "aaaa a aaa aaa";
        String regex = "a{3}";

        // compiling the matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s2);

        while(matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}
