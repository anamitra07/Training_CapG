package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {

        // ^ before [] means 'start with' and $ means 'ends with'
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}$";
        // ^[a-zA-Z0-9._%+-]+ -> rohit.jay (Here, + signifies that many characters can be used)
        // [a-zA-Z]+ -> gmail (Here, + signifies that many characters can be used)
        // '\\.' -> . (\\ signifies that . has been used as a symbol
        // [a-zA-Z]{2,6} -> com (2,6 signifies that 2 to 6 characters can be used.)

        String email = "rohit.jay@gmail.com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.find()) {
            System.out.println(matcher.group()+"  "+matcher.start());
        }
        else {
            System.out.println("Match not found!!");
        }
    }
}
