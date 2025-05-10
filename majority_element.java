import java.util.HashMap;

public class majority_element {
    public static int major(int[] arr){
         int n=arr.length;
    /*     
        HashMap<Integer,Integer> map=new HashMap<>();

        
      for(int i=0;i<n;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1); 
        if(map.get(arr[i])>n/2){
            return arr[i];
        }   
    }
    return -1;
    */

    //0(n)
    int cnt=0;
    int el=0;
    for(int i=0;i<n;i++){
        if(cnt==0){
            cnt=1;
            el=arr[i];
        }
        else if(arr[i]==el){
            cnt++;
        }
        else{
            cnt--;
        }
    }

    // might done only if there is stated that it might
    // not have a majority element 0(n)
    //only for checking
     int cnt1=0;
    for(int i=0;i<n;i++){
        if(arr[i]==el){
            cnt1++;
        }
        if(cnt1>n/2){
            return el;
        }
    }
    return -1;
   
}
    public static void main(String[] args) {
        int[] a={3,3,3,3,1,2,2};
        int result=major(a);
        System.out.println(result);
    }
}
