public class Prime_No_btw_two_no {
    public static void main(String[] args) {
        int a = 50;
        int b = 90;
        while (a<b)
        {
            boolean status = false;
            for (int i = 2 ; i<=a/2;i++)
            {
                if (a%i ==0)
                {
                    status = true;
                    break;
                }
            }
            if (status != true && b!=0 && b!= 1)  //Yha = false pe kaam nhi kr rha kyu?
             System.out.println(a);
            a++;
        }
    }
}
