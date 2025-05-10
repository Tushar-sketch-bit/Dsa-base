import java.util.Arrays;
import java.util.HashMap;

public class prefixSum {
    public static int[] prefix(int[] arr){
        int n=arr.length;

        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=ans[i-1]+arr[i-1];
        }
        return ans;
    }

    public static int subarrayOfLen0(int[] arr){
        int n=arr.length;
        int[] prefixarray=prefix(arr);
        int maxLength=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int prefixsum=prefixarray[i];
            if(prefixsum==0){
                maxLength=i+1;
            }
            if(map.containsKey(prefixsum)){
                maxLength=Math.max(maxLength, i-map.get(prefixsum));
            }
            else{
                map.put(prefixsum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] a={9,-3,3,-1,6,-5};        
    }
}
