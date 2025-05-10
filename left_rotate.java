import java.util.Arrays;

public class left_rotate {
    //rotate array by d places
    public static void rotate(int[] arr,int d){
        int[] temp=new int[d];
        int n=arr.length;
        //put d elements into temp
       for(int i=0;i<d;i++){ 
        temp[i]=arr[i];
       }
       //shift 
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        //put back temp
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-d-1];//or[i-(n-d)]
        }
    System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int d=3;
        rotate(a, d);
    }
}
