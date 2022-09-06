package dsa;
import java.util.*;
public class Arraylist_Stack {
    static class Stack{
       static ArrayList<Integer> l=new ArrayList<>();
        public static boolean isEmpty(){
           return l.size()==0;
        }
        public static void push(int data){
            l.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            //list er last index er jonno 
            
          int top=l.remove(l.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return l.get(l.size()-1);
        }
    }
    public static void main(String[] args) {
       Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
