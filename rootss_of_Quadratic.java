public class rootss_of_Quadratic {
    public static void main(String[] args) {
       double a = 5;
        double b = 8;
        double c = 9;

        double deter = (b*b) - (4*a*c);
        if (deter>0)
        {
            double root1= (-b-Math.sqrt(deter))/(2*a);
            double root2= (-b+Math.sqrt(deter))/(2*a);

            System.out.format("roots are %.2f and .2f" , root1,root2);
        }
        else if(deter== 0)
        {
            double  root2;
           double root1 =   root2= -b/(2*a);
            System.out.format("roots are %.2f and %.2f" , root1,root2);
        }

        else
        {
            double real = -b/(2*a);
            double img = Math.sqrt(-deter/(2*a));
            System.out.println("Real is :"+real);
            System.out.println("Imaginary is :"+img);
        }


    }
}
