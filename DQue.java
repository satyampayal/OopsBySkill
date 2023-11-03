public class DQue {
    static class DQueue{
        static int size;
        static int front;
        static int rear;
        static int arr[];

        DQueue(int n){
            size=n;
            arr=new int[n];
            rear=front=-1;
        }
         boolean isEmpty(){
           return front==-1 && rear==-1;
        }
        static boolean isFull(){
       return front==(rear+1)%size;
        }
         void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return ;
            }
            if(isEmpty()){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
         int remove(){
            if(isEmpty()){
                System.out.println(":Queue is Empty");
                return -1;
            }
             int result=arr[front];

            if(front==rear){
               front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;

        }
         int peak(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        DQueue q=new DQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(56);
        while(!q.isEmpty()){
            System.out.println(q.peak());
            q.remove();
        }
    }
}
