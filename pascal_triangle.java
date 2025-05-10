public class pascal_triangle {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static long triangle_element(int n,int r){
       long element=1;
       for(int i=0;i<r;i++){
        element=element*(n-i);
        element=element/(i+1);
       }
       // int element = factorial(numerator)/(factorial(denominator)*(factorial(numerator-denominator)));
        return element;
    }
    public static void main(String[] args) {
        int r=5,c=3;
        long result=triangle_element(r, c);
        System.out.println(result);


    }
}
