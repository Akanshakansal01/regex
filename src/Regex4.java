// Write a program to check whether the given mail id is valid or not
import java.util.regex.*;
import java.util.Scanner;
public class Regex4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        Pattern  p = Pattern.compile("[a-zA-Z0-9_.]+[@]{1}(gmail|yahoo|rediff)[.]com");
        Matcher m = p.matcher("akansha25@gmail.com");
        boolean b1 = m.matches();
        System.out.println(b1);

        System.out.println(Pattern.matches("[a-zA-Z0-9.]+[@]{1}(gmail|yahoo|rediff)[.]com",str));

        boolean b2= Pattern.compile("[a-zA-Z0-9.]+[@]{1}(gmail|yahoo|rediff)[.]com").matcher(str).matches();
        System.out.println(b2);
    }
}
