package NOVAinvent;

public class SecondMax {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,6,1};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
              if(arr[i]>max){
                secondMax=max;
                max=arr[i];
              }
              if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
              }
        }
        System.out.println(secondMax);
           int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
          for(int i=0;i<arr.length;i++){
              if(arr[i]<min){
                secondMin=min;
                min=arr[i];
              }
              if(arr[i]<secondMin && arr[i]!=min){
                secondMin=arr[i];
              }
        } 
        System.out.println(secondMin);
    }
}
