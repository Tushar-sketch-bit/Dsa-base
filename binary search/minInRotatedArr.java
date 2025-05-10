import java.util.Arrays;

public class minInRotatedArr {

/*     public static int MinElement(int[] arr){
        //Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        int n=arr.length;

        int low=0,high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
          if(arr[low]<=arr[mid]){
            ans=Math.min(ans, arr[low]);
            low=mid+1;
          }
          else{
            ans=Math.min(ans, arr[mid]);
            high=mid-1;
          }
        }
        return ans;

    }
        */
        public static int findMin(int[] arr) {
            int low = 0, high = arr.length - 1;
        
            while (low < high) {  // Use '<' instead of '<=' to avoid unnecessary iterations
                int mid = (low + high) / 2;
        
        // If mid element is greater than high element, the minimum is in right half
          if (arr[mid] > arr[high]) {
                    low = mid + 1;  
                } 
                // Otherwise, the minimum is in the left half or at mid itself
                else {
                    high = mid;  // Keep mid, because it could be the minimum
                }
            }
            return arr[low];  // low will point to the minimum element
        }
        
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,0,1,2};  
        int result=findMin(arr);
        System.out.println(result);
    }
}
