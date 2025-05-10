public class sum_2_better {
    public static String twoSum(int[] arr, int target){
        int n=arr.length;
        
        int l=0;
        int r=n-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                return "yes";
            }
            else if(sum<target) l++;
            else{
                r--;
            }
        }
        return "no";
    }


    public static void main(String[] args) {
        int[] a={2,5,6,8,11};
        int k=14;
        String result=twoSum(a, k);
        System.out.println(result);
        
    }
}
