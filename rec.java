public class rec {
    static long cal(long value , long length)
    {
        long val = value;
        for (long l =0; l< length -1 ; l++)
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

    static long sum(long value)
    {
        long a;
        long b;
        long sum = 0;
        long sumresult ;
        for (int i =0; value >0 ; i++)
        {
            a = value%10;
            sum = sum + a;
            value = value/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        long value = 77798;
        long length = 5;
        long vala ;



        if (value <= 9)
        {
            System.out.println(value);
        }
        else
        {
            vala = cal(value,length);
            System.out.println("Valla after repetation" + vala);
            for (int i = 0;vala > 9 ; i++)
            {
                long sumresult = sum(vala);
                vala = sumresult;
                System.out.println("Vala after first sum"+ vala);
                if (vala > 9)
                {
                    sumresult = sum(vala);
                    vala = sumresult;
                    System.out.println("Vala in first loop" + vala);
                    if (vala < 10)
                    {
                        System.out.println(vala);
                    }


                }
                else
                {
                    System.out.println(vala);
                }

            }


        }

    }
}
