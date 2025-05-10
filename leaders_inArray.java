import java.util.ArrayList;
import java.util.Vector;


public class leaders_inArray {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    public static void leader(int[] arr){
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        Vector<Integer> ans=new Vector<>();
        int Maximum=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>Maximum){
                list.add(arr[i]);
                ans.add(arr[i]);
                Maximum=arr[i];
            }
        }
        
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] a={10,22,12,3,0,6};
        leader(a);
    }
}
