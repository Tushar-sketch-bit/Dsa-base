public class stonks {
    public static int buy_sell(int[] arr){
        int n=arr.length;
        int minimum=arr[0];
        int profit=0;
        for(int i=0;i<n;i++){
            int cost=arr[i]-minimum;
            profit=Math.max(profit, cost);
            minimum=Math.min(minimum, arr[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] a={71,1,5,3,6,4};
        int result=buy_sell(a);
        System.out.println(result);
    }
}
