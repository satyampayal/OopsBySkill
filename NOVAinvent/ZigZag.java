package NOVAinvent;

public class ZigZag {
    static int[] zigzag(int[] arr){
       for(int i=0;i<arr.length-1;i++){
        // minimum
        if(i%2==0){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        else{        // maximum

              if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
       }
               return arr;


    }
    public static void main(String[] args) {
        int arr[]={4,3,7,8,6,2,1};
       
        int[] arr2=zigzag(arr);
        for(int item:arr2){
            System.out.print(item+" ");
        }
    }
}
