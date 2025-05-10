import java.util.HashSet;
import java.util.Set;

public class union {
   static void unique(int[] array_1, int[] array_2){
      Set<Integer> unique_elements=new HashSet<>();
      
     for(int i=0;i<array_1.length;i++){
      unique_elements.add(array_1[i]);
    }
    for(int i=0;i<array_2.length;i++){
        unique_elements.add(array_2[i]);
      }
      System.out.println(unique_elements);
}
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9};
        unique(a, b);
        
    }
}
