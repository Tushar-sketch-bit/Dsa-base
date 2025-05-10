import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
public class LestTest {

    public static void printlist(Object obj){
        System.out.println(obj+ " "+ obj.equals(obj));
    }
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
       int arr1=23;
       int arr2=25;
       int arr3=27;
       list.add(arr1);
       list.add(arr2);
       list.add(arr3);
       

      LinkedList<Object> hybridlist=new LinkedList<>();
      hybridlist.add(List.of(1,2,4));
      hybridlist.add(new Stack<Integer>());
      hybridlist.add(new int[]{10,20,30});
      hybridlist.add(Map.of("A",100,"B",200));

      System.out.println(hybridlist);
      





    }
}
