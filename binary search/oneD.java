import java.util.Arrays;

public class oneD{

    public static int recursiveBinSearch(int[] arr,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target) return mid;
        else if(target<arr[mid]){
           return recursiveBinSearch(arr, low, mid-1, target);
        }
        return recursiveBinSearch(arr, mid+1, high, target);
    }

    public static int search(int[] arr,int target){
        Arrays.sort(arr);
     return recursiveBinSearch(arr, 0, arr.length-1, target);
    }

   /*  public static int fXBinSearch(int[] arr,int target){
        int n=arr.length;
        int first=0;
        int last=n-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(arr[mid]==target){
                return mid;
            }  
            else if(target<arr[mid]){
                last=mid-1;
            }
            else {
                first=mid+1;
            }
        }
        return -1;
    }
        */
    public static void main(String[] args){
        int[] arr={5,4,3,9,1,6,8};
       // int result=fXBinSearch(arr, 4);
        //System.out.println("indexing of target is: "+result);
       int result= search(arr, 9);
        System.out.println("indexing of target after sorting array: "+result);
    }
}