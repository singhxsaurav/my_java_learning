public class linear_search {
    public static int lr_sc(int [] arr,int key){
        for (int i =0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] ar1={2,4,6,8,10,20};
        int key = 8;
        System.out.println(key+" is at index " + lr_sc(ar1,key));
    }
}
