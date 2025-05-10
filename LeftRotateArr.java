import java.util.Arrays;

public class LeftRotateArr {

    static void rev(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr,int k){
        int n=arr.length; 
       k=k%n; 
       rev(arr, 0, k-1);
       rev(arr, k, n-1);
       rev(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //rotate(arr);
        int k=11;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));   
    }
}
