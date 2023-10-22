public class longInt_to_Int {

    public static void main(String[] args) {
        //TYPE 1
        long a = 258785L;
        long b = 7845899L;

        int c = (int)a;
        int d = (int)b;

        System.out.println(c);
        System.out.println(d);
        //TYPE 2
        Long obj = 67458456L;
        int p = obj.intValue();
        System.out.println(p);

        //TYPE 3
        long value1 = 5289L;
        long value2 = -4588L;

        int numb1= Math.toIntExact(value1);
        int numb2= Math.toIntExact(value2);

        System.out.println(numb1);
        System.out.println(numb2);
    }
}
