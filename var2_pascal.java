public class var2_pascal {

    public static void nth_row(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        int n=6;
        nth_row(n); 
    }
}
