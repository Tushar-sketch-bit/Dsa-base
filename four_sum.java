import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;




public class four_sum {
    public static List<List<Integer>> chaukdi(int[] arr,int a){
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==k){
                            List<Integer> temp=new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
