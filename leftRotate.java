import java.util.Arrays;

public class leftRotate {
    public static void reverse(int[] arr,int start, int end){
     while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
     }
    }
    public static void rotate(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr, 0,  d-1);//reverse first d

        reverse(arr, d, n-1);//reverse (n-d)

        reverse(arr, 0, n-1);

     System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int b=3;
        rotate(a, b);
        
    }
}
