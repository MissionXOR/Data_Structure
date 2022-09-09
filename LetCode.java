
package dsa;
import java.util.*;
public class LetCode {
    public static void main(String[] args) {
         LinkedList<Integer> l = new LinkedList<>();
         l.add(1);
         l.add(2);
         l.add(3);
         l.add(4);
         Collections.swap(l, 0, 1);
         Collections.swap(l, 2, 3);
         System.out.println(l);
         
    }
}
