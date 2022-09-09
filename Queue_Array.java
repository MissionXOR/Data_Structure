package dsa;
public class Queue_Array {
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;
        queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //enqueue
        public static void add(int data){
            if(rear==size-1){
                System.out.println("overflow");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            int fornt=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return fornt;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String[] args) {
      queue q=new queue(5);
      q.add(1);
      q.add(2);
      q.add(3);
      /* in queue data store: 1 2 3
          In stack data store:3 2 1 
      */
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
      }
      
    }
    
}
