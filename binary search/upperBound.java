import java.util.Arrays;

public class upperBound {

    public static int bound(int[] arr,int target){
        Arrays.sort(arr);
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={2,3,6,7,8,8,11,11,11,12};
        int target=12;
        int result=bound(a, target);
        System.out.println("Index location of upper bound: "+result);
        
    }
}
