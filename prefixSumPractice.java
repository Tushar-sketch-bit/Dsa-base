import java.util.HashMap;

public class prefixSumPractice {
    /*
    public static int[] prefixSumArray(int[] arr){
        int n=arr.length;
        int[] ans=new int[arr.length+1];
        ans[0]=0;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i-1];
        }
        return ans;
    }
        */

    public static int sumDivisibleByK(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        //arr=prefixSumArray(arr);
        int count=0,sum=0;
        int remainder;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            remainder=(sum%k+k)%k;
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            else{
                map.put(remainder,map.getOrDefault(remainder, 0)+1);
            }
             
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={23,2,4,6,7};
        int k=6;
        int result=sumDivisibleByK(arr, k);
        System.out.println(result);
    }
}
