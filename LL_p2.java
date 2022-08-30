package dsa;
/*Take elements(numbers in the range of 1-50) of a Linked List as input
from the user. Delete all nodes which have values greater than 25.*/
import java.util.LinkedList;
import java.util.Scanner;
public class LL_p2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        //System.out.print("Add Element: ");
         for(int i=0;i<num;i++){
            int element=s.nextInt();
            ll.add(element);
        }
        System.out.print("LinkedList elements are: ");
        for(int i=0;i<ll.size();i++){
            if(ll.get(i)>25){
            ll.remove(i);
            i--; 
// this is because everytime we delete an element, the next comes in place of it so we need to check new element.
            }      
    }
        System.out.println(ll);
        
}
}
