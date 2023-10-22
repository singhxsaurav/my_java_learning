import java.util.Scanner;
public class quad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of A");
        double a = s.nextDouble();
        System.out.println("Enter the value of B");
        double b = s.nextDouble();
        System.out.println("Enter the value of C");
        double c = s.nextDouble();
        double d = (b*b)-(4*a*c);
        //System.out.println(Math.sqrt(5));
        if (d>0)
        {
            double root1= (-b-Math.sqrt(d))/(2*a);
            double root2= (-b+Math.sqrt(d))/(2*a);

            System.out.format("roots are %.2f and %.2f" , root1,root2);
        }
        else if(d== 0)
        {
            double  root2;
            double root1 =   root2= -b/(2*a);
            System.out.format("roots are %.2f and %.2f" , root1,root2);
        }

        else
        {
            double real = -b/(2*a);
            double img = Math.sqrt(-d/(2*a));
            System.out.println("Real is :"+real);
            System.out.println("Imaginary is :"+img);
        }
    }
}
