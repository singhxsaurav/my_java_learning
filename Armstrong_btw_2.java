import java.util.Scanner;
public class Armstrong_btw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Lower No:\nNote:-Lower Limit should be greater than 10:");
        int lower = sc.nextInt();
        while (lower <11)
        {
            System.out.println("Oho!! You have enter "+lower+ " Which is less than or equal to 10.\nPlease enter lower limit again: ");
            lower = sc.nextInt();
        }
        System.out.println("Please enter the upper No:  ");

        int upper = sc.nextInt();

     for (int l = lower;l<=upper;l++) {
         int num = l;
         int check = num;
         int a;
         int sum = 0;
         int length = (int) (Math.log10(num) + 1);
         //System.out.println("Length of Num is:" + length);
        // System.out.println("Number is :"+ check);
         while (num > 0) {
             a = num % 10;
             int b = 1;
             for (int i = 0; i < length; i++) {
                 b = b * a;
             }
             sum = sum + b;
             num = num / 10;

         }

         if (check == sum) {
             System.out.println("Num is Armstrong " + sum);
         }
     }




    }
}
