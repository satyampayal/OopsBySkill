//import java.util.ArrayList;

//import StackImp.Stack;

import java.util.Stack;

public class Stacklass {
    // class  Stack1{
    //    ArrayList<Integer> list=new ArrayList<>();

    //     public static boolean isEmpty() {
    //         return list.size();
    //     }

    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     public static void pop() {
    //         if(list.size()==0){
    //             return -1;
    //         }
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }
    //     public static int peak(){
    //          if(list.size()==0){
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);

    //     }
    // }
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
             int top=s.pop();
             pushAtBottom(data, s);
             s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
           if(s.isEmpty()){
            return;
           }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        //  Stack1 s=new Stack1();
        //  s.push(1);
        //  s.push(2);
        //  System.out.println(s.peak());
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
                // push at the bottom
       // pushAtBottom(4,s);

        // reverse stack
        reverseStack(s);

         while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
       

    }
}
 