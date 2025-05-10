import java.util.Arrays;

public class no_of_0s_1s_2s {
   /*  public static void sort(int[] arr){
        int n=arr.length;
        int count0=0;
        int count1=0;
        int count2=0;
        

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i]=1;
        }
        for(int i=count0+count1;i<n;i++){
            arr[i]=2;
        }

        System.out.println(Arrays.toString(arr));

        
    }
        */
        public static void swap(int[] arr,int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }

        public static void dnf_sort(int[] arr){
            int n=arr.length;
            int low=0;
            int mid=0;
            int high=n-1;
            while(mid<=high){
                if(arr[mid]==0){
                    swap(arr, mid, low);
                    low++;
                    mid++;
                }
                else if(arr[mid]==1){
                        mid++;
                }
                else{
                    swap(arr, mid, high);
                    high--;
                }
            }
            System.out.println(Arrays.toString(arr));
        }


    public static void main(String[] args) {
        int[] a={0,1,2,0,1,2,1,2,0,0,0,1};
        //sort(a);
        dnf_sort(a);
    }
    
}
