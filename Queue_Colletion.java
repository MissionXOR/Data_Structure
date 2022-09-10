package dsa;
import java.util.*;
public class Queue_Colletion {
    public static void main(String[] args) {
        /*q ueue is a interface and LinkedList
        is a class so a class make a object.
        two calass implements in queue
        1:ArrayDequeue
        2:LinkedList
        */
     // Queue<Integer> q=new LinkedList<>();
         Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
