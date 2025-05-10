public class searchInRotateArr {
    public static int Search(int[] arr,int target){
        int ans=-1;
        int n=arr.length;
        int low=0;
        int high =n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
            }
            if(arr[mid]>target){
                high=mid-1;
            }

         }
            return ans;
        }
        
    

    public static void main(String[] args) {
        int[] arr={7,8,9,1,2,3,4,5,6};
        int target=1;
        int result=Search(arr, target);
        System.out.println("index of target is: "+result);
    }
}
