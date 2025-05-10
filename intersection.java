import java.util.ArrayList;

public class intersection{

    public static void same(int[] arr_1,int[] arr_2){
        int i=0,j=0;

        ArrayList<Integer> list=new ArrayList<>();
        while(i<arr_1.length && j<arr_2.length){
          if(arr_1[i]<arr_2[j]){
            i++;
         }
          else if(arr_1[i]>arr_2[j]){
            j++;
         }
         else{
            list.add(arr_1[i]);
            j++;
            i++;
         }

      }
        
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] a={1,2,2,3,3,4,5,6};
        int[] b={2,3,3,4};
        same(a, b);
        
    }
}
