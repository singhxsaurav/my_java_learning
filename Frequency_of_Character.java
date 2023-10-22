public class Frequency_of_Character {

    public static void main(String[] args) {
        String str = "I am a Good and also Responsible boy";
        char ch = 'a';
        int a =0;
        int i = 0;
        while( i < str.length())
        {
            if (ch==str.charAt(i)){
                a = a+1;
            }
            i++;
        }

        System.out.println("Frequency is :" + a);
    }

}
