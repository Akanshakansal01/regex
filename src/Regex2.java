//  Write a regular expression to represent all names end with J | j .
import java.util.Scanner;
import java.util.regex.*;
public class Regex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        Pattern p= Pattern.compile("[a-zA-Z]+[J|j]");
        Matcher m= p.matcher(str);
        boolean b1= m.matches();
        System.out.println(b1);

        System.out.println(Pattern.matches("[a-zA-Z]+[J|j]",str));

        boolean b2= Pattern.compile("[a-zA-Z]+[J|j]").matcher(str).matches();
        System.out.println(b2);
    }
}
