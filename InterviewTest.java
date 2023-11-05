public class InterviewTest {
    class A{
        int x=10;
        static void my(){  
            // int x=x;        
            System.out.println(2222);
          //  mx(); // mx is non static method to call first make objects then call
            System.out.println(33333);
        }
          void mx(){
            System.out.println(1111);
        }
    }
       void mx(){
            System.out.println(1111);
        }
    public static void main(String[] args) {
        A.my();
        InterviewTest bb=new InterviewTest();
        bb.mx();
       String s1=new String("Hii");        String s2=new String("Hii"); 
     //  s1=s1+"23";
    System.out.println(s1.equals(s2));// true now its check content becuse of s1 is not object
    System.out.println(s1.hashCode());    System.out.println(s2.hashCode());


        // StringBuilder s1=new StringBuilder("h1");        StringBuilder s2=new StringBuilder("h1");
        // System.out.println(s1.equals(s2));


        // it shows error on compile time(Checking) error 
      //  System.out.println( 0.1 +0.2===0.3);
    }
}
