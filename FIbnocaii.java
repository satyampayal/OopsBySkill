public class FIbnocaii {
    public static int fib(int n){  // O(2^N)
        if(n==0 || n==1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
      
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
