
public  class Jospheus{

    public static int jospheus(int n,int k){
        if(n==1){
            return 0;
        }
       // System.out.println(n);
        return (jospheus(n-1, k)+k)%n;
       
        
    }

    public static void main(String[] args) {
       
     System.out.println("Person "+(jospheus(7, 3)+1)+" are live");

    }
}