import java.util.Scanner;
public class abcde {
    static long cal(long value , long length)
    {
        long val = value;
        for (long l =0; l< length - 1 ; l++)
        {
           // long val = value;
            for (long b = 0; b < length ;b++)
            {
                value = value*10;
            }
            value = value + val;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" En");
       long value = 148 ;//sc.nextLong();
      long length = 3; //sc.nextLong();
       long va;
       long ppp = 0;


        for (int i =0 ; ; i++)
        {



            if (length > 1)
            {

                va = cal(value,length);
               System.out.println("Repeated value is"+ va);

                long sum = 0;
                long p;

                    for (int m = 0; va > 0; m++)
                    {
                        p= va%10;
                        sum = sum + p;
                        va= va/10;
                    }
                System.out.println( "sum is " + sum);
                    ppp=sum;

            }
            else if (length == 1)
            {
                System.out.println(value);
                break;
            }
            value = ppp;
            int t = (int)value;
            int lenI = (int) (Math.log10(t) + 1);
            length = lenI;


        }



    }
}
