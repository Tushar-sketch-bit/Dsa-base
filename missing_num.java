public class missing_num {
    public static int Num(int[] arr,int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1^=n;
        return xor1^xor2;
   }
    public static void main(String[] args) {
       /*  int a=2;
        int b=7;
        int xor=a^b;
        System.out.println(xor);
        */
        int[] a={1,2,4,5};
        int n=5;
        int result=Num(a, n);
        System.out.println(result);
    }
}
