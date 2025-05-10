import java.util.Arrays;

public class permutation {

    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    } 
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static int[] next(int[] arr){
        int n=arr.length;
        int index=-1;
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr, 0, n-1);
            return arr;
        }
        
        for(int i=n-1;i>=index;i--){
            if(arr[i]>arr[index]){
                swap(arr, index, i);
                break;
            }
        }
        reverse(arr, index+1, n-1);
        return arr;


    }
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
        int[] result=next(arr);
        System.out.println(Arrays.toString(result));
        


    }
    
}
