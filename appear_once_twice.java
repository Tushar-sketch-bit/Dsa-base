public class appear_once_twice {
    public static int nums(int[] arr){
        int xor=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,4,4};
        int result=nums(a);
        System.out.println(result);
    }
}
