import java.util.Arrays;

public class set_zeroes_1 {
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void zeroes(int[] arr){//move zeroes to end
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                swap(arr, i, j);
                
            }
            j++;
        }
     }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a={1,0,2,0,4,0,5,6,7};
        zeroes(a);
        
        
    }
}
