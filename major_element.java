import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class major_element {
   /*  private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    } 
        */
    public static List<Integer> major(int[] arr, int n){
        List <Integer> list=new ArrayList<>();
        // this code works only if there is 1 major element in n/3 case
        //but it can be 2 elements
      /*   int element=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(count==0){
                count++;
                element=arr[i]; 
            }
           else if(element==arr[i]){
                count++;
            }
            else{
                count--;
            }
            
        }
         int cnt1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                cnt1++;
            }
            if(cnt1>n/3){
                return element;
            }
        }
            */

            int el1=0,count1=0,el2=0,count2=0;
            for(int i=0;i<n;i++){
                if(count1==0 && arr[i]!=el2){
                    count1++;
                    el1=arr[i];
                }
                else if(count2==0 && arr[i]!=el1){
                    count2++;
                    el2=arr[i];
                }
                else if(el1==arr[i]) count1++;
                else if(el2==arr[i]) count2++;
                else{
                    count1--;
                    count2--;
                }
            }
            int cnt1=0,cnt2=0;
            for(int i=0;i<n;i++){
                if(arr[i]==el1) cnt1++;
                else if(arr[i]==el2) cnt2++;
            }
            if(cnt1>=(n/3)+1) list.add(el1);
            if(cnt2>=(n/3)+1) list.add(el2);

            return list;
    }


    public static void main(String[] args) {
    int[] a={1,1,1,3,2,2,2,3};
    int n=8;
    
    System.out.println(major(a, n));
    
    
    
        
    }
}
