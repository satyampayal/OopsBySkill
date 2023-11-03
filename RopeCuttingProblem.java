/*
 * given rope length
 */
public class RopeCuttingProblem {
    public static int maxPiese(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int l1=maxPiese(n-a, a, b, c);
        System.out.println(l1+" l1 value");
        int l2=maxPiese(n-b, a, b, c);
        System.out.println(l2+" l2 value");

        int l3=maxPiese(n-c, a, b, c);
         System.out.println(l3+" l3 value");


        int max=Math.max(Math.max(l1,l2),l3);
        if(max== -1){
            return -1;
        }
        return max+1;
    }
    public static void main(String[] args) {
        System.out.println(maxPiese(7, 2, 3 ,5));
    }
    
}
