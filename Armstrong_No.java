public class Armstrong_No {
    public static void main(String[] args) {
        int sum =0;
        int a;
        int length;
        int num = 153;
        length = (int)(Math.log10(num)+1);

        while (num>0)
        {
            a = num%10;
            int b = a*a*a;
            sum = sum +b;
            num = num/10;
        }
        System.out.println(sum);
    }/* test of git hub*/
}
