import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class optimal_threesum {
    //if(sum<0){increase value}j++
    //if(sum>0){decrease value}k--;
    //if(sum==0){store triplet};
    public static List<List<Integer>> triplet(int[] arr,int n){
        
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp=new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;

                }
            }
        }

        return ans;
    }

//TC->O(N LOGN)FOR SORT +O(N*M)FOR +WHILE LOOP
    public static void main(String[] args) {
        int[] a={-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        triplet(a, a.length);
        System.out.println(triplet(a, a.length));
    }
}
