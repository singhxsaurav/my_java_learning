public class sum {
    public static void main(String[] args) {
        long l = 56987;
        long sum = 0;
        long r;
        for (int i =0 ; l >0 ; i++)
        {
            r = l %10;

            sum = sum + r;
            l = l/10;
        }
        System.out.println(sum);
    }
}
