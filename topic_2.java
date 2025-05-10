public class topic_2 {
    public static int secondLargest(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int Secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                Secondlargest=max;
                max=Math.max(max,arr[i]);
            }
            else if(arr[i]>Secondlargest && arr[i]<max){
                Secondlargest=arr[i];
            }
        }
        return Secondlargest;

    }
    public static void main(String[] args) {
        int[] a={2,3,5,6,7,9};
        int result=secondLargest(a, a.length);
        System.out.println(result);
    }
}
