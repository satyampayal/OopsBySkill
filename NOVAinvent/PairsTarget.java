package NOVAinvent;

public class PairsTarget {
    public static void main(String[] args) {
        int arr[]={3,4,6,7,1};
    for(int i=0;i<arr.length;i++)  {
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==7){
                System.out.print(arr[i]+" and"+arr[j]);
            }
        }
        System.out.println();
    }
    }
  
}
