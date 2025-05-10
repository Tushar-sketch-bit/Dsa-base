public class consecutive_ones {
    public static int nums(int[] arr){
        int maxlength=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxlength=Math.max(maxlength, count);
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[] a={1,1,0,0,1,1,1,0,1,1};
        int result=nums(a);
        System.out.println(result);
        
    }
}
