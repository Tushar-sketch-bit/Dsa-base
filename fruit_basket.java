import java.util.*;



public class fruit_basket {
    public static int fruits(int[] arr,int k){
        int l=0,r=0,maxlength=0;
         while(r<arr.length){
          Set<Integer> fal=new HashSet<>();
          fal.add(arr[r]);
         
         while(fal.size()<=k){
            maxlength=Math.max(maxlength,r-l+1);
         }
         if(fal.size()>k){
            arr[l]--;
            l++;
         }
         r++;
    }
}
    public static void main(String[] args) {
        
    }
    
}
