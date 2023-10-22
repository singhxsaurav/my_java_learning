import java.util.Arrays;
public class jv1 {
    public static void main(String[] args) {
        int [] arr_i= {1,5,6,8,4,7,25,36,85,25,65};
        String [] arr_s={"Hey","CGC","CU","CHANDIGARH"};
       // System.out.println(arr_i[5]);
        for (int a:arr_i)
        {
            System.out.print(a);

        }
        System.out.println();
        System.out.println(Arrays.toString(arr_i));
        Arrays.sort(arr_i);
        System.out.println(Arrays.toString(arr_i));

        System.out.println(Arrays.toString(arr_s));
        Arrays.sort(arr_s);
        System.out.println(Arrays.toString(arr_s));
    }
}
