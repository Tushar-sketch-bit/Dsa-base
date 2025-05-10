import java.util.ArrayList;
import java.util.List;

public class var3_pascal {
    public static void nCr(int n, int r){
        int element=1;
        for(int i=1;i<r;i++){
            element=element*(n-i);
            element=element/(i+1);  
        }
    }
    public static List<Integer> nth_row(int n){
        int ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i)/i;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public static List<List<Integer>> triangle(int n){
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=n;row++){
            ans.add(nth_row(row));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = triangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
