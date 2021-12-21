// Write a program in java to check string contains special characters in java
import java.util.Scanner;
import java.util.regex.*;
public class REgex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Pattern  p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher(str);
        boolean isStringContainsSpecialCharacter = m.find();
        if(isStringContainsSpecialCharacter)
            System.out.println(str+ " contains special character");
        else
            System.out.println(str+ " does NOT contain special character");
    }
}
