import java.util.Locale;
import java.util.Scanner;

public class palindrome_String {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your String");

        String str = s.nextLine();
        int a = str.length();
        String rev = "";
        for (int b = a-1; b>=0; b--)
        {
            rev = rev + str.charAt(b);
        }
        String strl = str.toLowerCase(Locale.ROOT);
        String revl = rev.toLowerCase(Locale.ROOT);

        System.out.println(strl);
        System.out.println(revl);

        if (revl.equals(strl))
        {
            System.out.println("Given string: "+ str +" is Palindrom");
        }

        else
        {
            System.out.println("Given string: "+ str +" is not Palindrom");
        }
    }
}
