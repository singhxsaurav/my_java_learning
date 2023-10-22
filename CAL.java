import java.util.Scanner;
public class CAL {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first no-");
        int y = s.nextInt();

        System.out.println("Enter the second no-");
        int x = s.nextInt();

        int r = y%x;
        System.out.println("Result is:-");
        System.out.println(r);
    }
}
