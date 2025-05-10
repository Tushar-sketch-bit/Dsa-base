import java.util.Arrays;

public class prefix_sum {
    public static int[] sum(int[] arr){
     int[] prefix=new int[arr.length+1];
        prefix[0]=0;
        int n=arr.length;
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        return prefix;
    }
    public static int query(int[] prefix,int l,int r){
        return prefix[r+1]-prefix[l];
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] result=sum(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(query(result, 0, 3));
    }
}
