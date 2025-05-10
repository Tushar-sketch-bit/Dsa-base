public class set_zeroes {
    public static void do_zero(int[][] arr,int n,int m){
     // int[] row = new int[n]; --> matrix[..][0]
    //    int[] col = new int[m]; --> matrix[0][..]
    int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //mark the ith row
                //mark the jth colmnun
                if(arr[i][j]==0){
                arr[i][0]=0;
                if(j!=0){
                arr[0][j]=0;
                }
                else{
                    col0=0;
                }
            }

        }
    }

    for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            if(arr[i][j]!=0){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
    }
    if(arr[0][0]==0){
        for(int j=0;j<m;j++) arr[0][j]=0;

    }
   if(col0==0){
    for(int i=0;i<n;i++) arr[i][0]=0;
   } 

   for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   } 


 }


      
     public static void main(String[] args) {
        int[][] a={
            {1,1,1,1},
            {1,0,1,1},
            {1,1,0,1},
            {0,1,1,1}
        };
        do_zero(a, 4, 4);

     }
}
