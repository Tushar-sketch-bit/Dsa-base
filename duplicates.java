public class duplicates {
    public static int remove_duplicate(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] a={1,1,1,2,2,2,3,3,3};
        int result=remove_duplicate(a);
        System.out.println(result);
        
    }
}
