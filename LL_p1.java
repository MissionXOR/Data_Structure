/*
Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
Search for the number 7 & display its index.
 */
 
package dsa;
import java.util.*;
public class LL_p1 {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(5);
        l.add(7);
        l.add(3);
        l.add(8);
        l.add(2);
        l.add(3);
        System.out.print(l+" ");
        System.out.println();
        for(int i=0;i<l.size();i++){
            if(l.get(i)==7){
                System.out.println("index is:"+i);
            }      
        }      
    }
}
