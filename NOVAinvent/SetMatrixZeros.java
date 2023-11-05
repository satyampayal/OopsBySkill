package NOVAinvent;

public class SetMatrixZeros {
    // step 1 create array and where i found array[i][j]==0 make arr1[i]=0 and arr2[j]=0
    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 0}, {0, 1, 0, 1}};
        int arr1[] = {1, 1, 1, 1};
        int arr2[] = {1, 1, 1, 1};
        // step 1
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    arr1[i]=0;
                    arr2[j]=0;
                }
            }
        }
        // step2 ---> make row zero and column
            for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr1[i]==0 || arr2[j]==0 ){
                    arr[i][j]=0;
                   
                }
            }
        }
        // now print
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
           System.out.print(arr[i][j]+" ");
            }
          System.out.println();
        }

    }
}
