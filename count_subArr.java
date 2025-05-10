public class count_subArr {
    public static int noOfSubArrayWithSum(int[] arr,int k){
        int n=arr.length;
        int count=0;
        int l=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>k ){
                sum-=arr[l];
                l++;
            }
            if(sum==k) count++;
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a={3,1,2,4};
        int k=6;
        int result=noOfSubArrayWithSum(a, k);
        System.out.println(result);
    }
}
