import java.util.Scanner;
public class leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int y = sc.nextInt();
        int a = y%4;
        if (y % 4 ==0 ) {

            System.out.println("Year " + y + " is a leap Year");
        }
        else if (y % 400 == 0 && y % 100 != 0) {
            System.out.println("Year " + y + " is a leap Year");
        }

        else
            System.out.println("Year " + y + " is not a leap Year");
    }
}
