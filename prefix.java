import java.util.Arrays;

public class prefix {
    public static int[] sum(int[] arr){
      int[] prefix_sum=new int[arr.length+1];
      int n=arr.length;
      prefix_sum[0]=arr[0];
      for(int i=1;i<n;i++){
        prefix_sum[i]=prefix_sum[i-1]+arr[i];
      }
        return prefix_sum;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] result=sum(a);
        System.out.println(Arrays.toString(result));
    }
}
