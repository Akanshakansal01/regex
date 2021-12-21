// Write a regular expression to represent all names start with N|n  and ends with j|J
import java.util.Scanner;
import java.util.regex.*;
public class Regex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Pattern p = Pattern.compile("[N|n][a-zA-Z]+[J|j]");
        Matcher m = p.matcher(str);
        boolean b1 = m.matches();
        System.out.println(b1);

        System.out.println(Pattern.matches("[N|n][a-zA-Z]+[J|j]", str));

        boolean b2 = Pattern.compile("[n|N][a-zA-Z]+[J|j]").matcher(str).matches();
        System.out.println(b2);
    }
}
