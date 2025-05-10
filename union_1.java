import java.util.ArrayList;


public class union_1 {
    static void union(int[] a,int[] b){
        ArrayList<Integer> unique= new ArrayList<>();
        /*int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=b[j]){
                if(!unique.contains(a[i])){
                unique.add(a[i]);
                j++;
            }
            else{
                unique.add(b[j]);
            }
         }
      }*/
      int i=0,j=0;
      while(i<a.length && j<b.length){
        if(a[i]<=b[j] && !unique.contains(a[i])){
                unique.add(a[i]);
            i++;
        }
        else if(a[i]==b[j]){
            j++;
            i++;
        }
        else{
            if(!unique.contains(b[j])){
                unique.add(b[j]);
            }
            j++;
        }
      }
      while(i<a.length){
        if(!unique.contains(a[i])){
            unique.add(a[i]);
        }
        i++;
      }
      while(j<b.length){
        if(!unique.contains(b[j])){
            unique.add(b[j]);
        }
        j++;
      }
      System.out.println(unique);

    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5, 6};
        int[] array2 = {2, 3, 5, 7};
        union(array1, array2);
    }
}
