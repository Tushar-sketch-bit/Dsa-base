public class count_subarray {
    public static int sub_arrays(int[] arr,int k){
        int n=arr.length;
        int count=0;
        int l=0;
        int sum=0;

        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>k && l<=r){
                
                    sum-=arr[l];
                    l++;
                }
                if(sum==k){
                    count++;
                  }
            }
        
        return count;
    }
    public static void main(String[] args) {
        int[] a={1,10,5,6,7,4,8,3};
        int result=sub_arrays(a, 11);
        System.out.println(result);
    }
}
