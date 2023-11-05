public class LL {
    Node head;
    static int size;
     class Node{
        int data;
        Node next;
       
        Node(int data){
            this.data=data;
            next=null;
            size+=1;
        }
    }
         void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
              head=newNode;
              return;
            }
            newNode.next=head;
            head=newNode;
        }
        // Add Last
        void addLast(int data){
              Node newNode=new Node(data);
            if(head==null){
              head=newNode;
              return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        // size 
        // int sizeOfLL(){
        //       if(head==null){
        //         return 0;
        //       }
        //       int count=0;
        //       Node temp=head;
        //       while(temp!=null){
        //        count+=1;
        //        temp=temp.next;
        //       }
        //       return count;
        // }
        void kthAdd(int data,int k){
             if(size<k){
                System.out.println("Not add posible");
                return;
             }
             Node temp=head;
             int i=1;
             while(i<k-1){
                temp=temp.next;
                i++;
             }
             Node newNode=new Node(data);
             newNode.next=temp.next;
             temp.next=newNode;

        }
        void print(){
             if(head==null){
              System.out.println("Empty");
              return;
            }
              Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }

        }
        
    
    public static void main(String[] args) {
        LL n1=new LL();
        n1.addFirst(1);
        n1.addFirst(2);
        n1.addFirst(3);
        n1.addLast(4);
        n1.kthAdd(5, 3);
        // System.out.println("Size "+n1.sizeOfLL());
        n1.print();

    }
}
