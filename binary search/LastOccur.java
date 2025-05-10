public class LastOccur {
    public static int lastOccurence(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int ans=n;
        int high =n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                 ans=mid;
               }
            else if(arr[mid]>=target){
                high=mid-1;
             //   if(arr[mid]==target){
               // ans=mid;
                //}
            }
            else{
                low=mid+1;
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6,6,7};
        int target=6;
        int result=lastOccurence(arr, target);
        System.out.println(result);
    }
    
}
