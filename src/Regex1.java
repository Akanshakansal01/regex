// Write a regular expression to represent all names start with N | n with any length.
import java.util.Scanner;
import java.util.regex.*;

public class Regex1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        Pattern p= Pattern.compile("[Nn][a-z A-Z]+");
        Matcher m= p.matcher(str);
        boolean b1= m.matches();
        System.out.println(b1);

        boolean b2= Pattern.compile("[Nn][a-z A-Z]+").matcher(str).matches();
        System.out.println(b2);

        System.out.println(Pattern.matches("[Nn][a-zA-Z]+",str));


    }
}
