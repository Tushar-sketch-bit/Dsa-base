import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;;


public class Threesome {
    public static List<List<Integer>> Triplet(int[] arr){
        List<List<Integer>> ans=new ArrayList<>();
        
        Set<Integer> elements=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=i+1;j<n;j++){
                int compliment=-(arr[i]+arr[j]);
                if(elements.contains(compliment) && arr[i]!=arr[j]){
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(compliment);
                    elements.add(arr[j]);
                    j++;
                }
                else if(arr[i]==arr[j]){
                    j++;
                }
                else{
                    elements.add(arr[j]);
                    j++;
                }
            }
            ans.add(temp);
        }
    
        return ans;
    }
    public static void main(String[] args) {
        int[] a={-1,0,1,2,-1,-4};
        System.out.println(Triplet(a));
        
    }
}
