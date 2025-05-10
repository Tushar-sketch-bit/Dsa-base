import java.util.HashMap;

public class sum_2 {

    public static void twoSum(int[] arr,int target){
        int n=arr.length;
        int second=0;
        int first=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int compliment=target-arr[i];
           
           if(map.containsKey(compliment)){
            first=map.get(compliment);
            second =i;
            break;
           }
           map.put(arr[i], i);
        }
        System.out.println(first +" "+second);
    }
    public static void main(String[] args) {
        int[] a={2,6,5,8,11};
        int target=14;
        twoSum(a, target);
    }
    
}
