public class subarray {
    public static int longest(int[] arr,int k){
        int maxlength=0;
        int n=arr.length;
        int l=0;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>=k){
                if(sum==k){
                   maxlength=Math.max(maxlength, r-l+1);
                }
                sum-=arr[l];
                l++;
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,1,1};
        int k=3;
        int result=longest(a, k);
        System.out.println(result);

        
    }
}
