package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        // String regex = "^[789]\\d{9}";
        String regex = "[789]\\d{9}";
        // [789] -> checks if first digit is 7 or 8 or 9
        // d{9} -> signifies that 9 more digits can be used

        String text = "7538203920,7896543256";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group()+"  "+matcher.start());
        }
//        if(matcher.find()) {
//            System.out.println(matcher.group()+"  "+matcher.start());
//        }
//        else {
//            System.out.println("Match not found!!");
//        }
    }
}
