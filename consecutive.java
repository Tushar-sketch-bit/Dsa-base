public class consecutive {
    public static int Consecutive_ones(int[] arr,int k){
     int maxlength=0;
     int l=0;
     int zerocount=0;
     for(int r=0;r<arr.length;r++){
        if(arr[r]==0){
            zerocount++;
        }
            if(zerocount>k){
                if(arr[l]==0){
                    zerocount--;
                }
                l++;
            }
     
    if(zerocount<=k){
        maxlength=Math.max(maxlength, r-l+1);
     }
     }
     return maxlength;
    }

    
    public static void main(String[] args) {
        int[] a={1,1,1,0,0,0,1,1,1,1,0};
        int result=Consecutive_ones(a, 2);
        System.out.println(result);
    }
}
