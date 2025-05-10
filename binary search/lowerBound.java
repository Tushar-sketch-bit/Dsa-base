public class lowerBound{
    public static int leastIndex(int[] arr,int n, int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
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
        int[] a={3,5,8,15,19};
        int x=9;
        int n=a.length;
        int result=leastIndex(a, n, x);
        System.out.println(result);
    }
}