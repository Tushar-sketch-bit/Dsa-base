public class floorAndCeil {

    public static void floorofArray(int[] arr,int target){
        int n=arr.length;
        int ans;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                low=mid+1;
                ans=arr[mid];
            }
            else{
                high=mid-1;
                
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
