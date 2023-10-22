import java.lang.reflect.Array;

public class STRING_TOCHAR {
    public static void main(String[] args) {
        char [] ch = {'a','b','c'};
        //String st = String.valueOf(ch);
        String st1 = new String(ch);

       // System.out.println(st);
        System.out.println(st1);

        String str = "Hey World I am early creation of Saurav";
        char [] chr = str.toCharArray();
        System.out.println(chr.length);

    }
}
