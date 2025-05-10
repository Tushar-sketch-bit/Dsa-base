import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;



public class three_sum {
    public static List<List<Integer>> sumZero(int[] arr){
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[j]==0 && arr[i]!=arr[j] && arr[j]!=arr[k] && arr[i]!=arr[k]){
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
