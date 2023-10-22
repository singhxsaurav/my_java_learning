import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower Limit");
        int lower = sc.nextInt();
        System.out.println("Enter Upper limit");
        int upper = sc.nextInt();
        int count = 0;
        int i;
        int c ;
        for (i = lower; i<upper;i++)
        {
            System.out.println("Loop value is:" + i);

             c = i*i*i;
            if (c<upper)
            {
                count = count +1;
                System.out.println(c);
            }
            else
            {
                System.out.println("Limit Reached");
                break;

            }

        }

    }
}
