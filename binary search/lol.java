public class lol {
    public static int binSearch(int[] arr,int target){
        int n=arr.length;
        int ans=-1;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={3,4,13,13,13,20,40};
        int target=13;
        int result=binSearch(a, target);
        System.out.println("last occurence of target is: "+result);
    }
}
