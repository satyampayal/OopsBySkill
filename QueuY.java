public  class QueuY{
   static class Queue{
        static int  rear;
        static int size;
        static int arr[];
        Queue(int n){
           size=n;
           arr=new int[n];
           rear=-1;
        }

        boolean isEmpty(){
            return rear==-1;
        }
        // enqueq
         void add(int data){
            if(rear==size-1){
              System.out.println("Quesue is full");
              return;
            }
            rear++;
            arr[rear]=data;
        }
        //Dequeue
         int remove(){
            if(isEmpty()){
             System.out.println("Queue is Empty");
             return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;

            return front;
        }
         int peak(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }

    }
  

    public static void main(String[] args) {
      
        Queue q=new Queue(5);
        System.out.println();
        q.add(1);
        q.add(2);
        q.remove();
        q.add(1);
        q.add(2);

        while(!q.isEmpty()){
            System.out.println(q.peak());
            q.remove();
        }
        
    }

}