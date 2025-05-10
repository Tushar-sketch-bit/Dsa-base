public class max_subarray {
    public static int max(int[] arr,int n){
        int maxlength=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum>maxlength){
            maxlength=sum;

           }
           if(sum<0){
            sum=0; 
           }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        
    }
}
