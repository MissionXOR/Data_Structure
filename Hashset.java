package dsa;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();
        //add  ..set does not allow duplicate value
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);
        System.out.println(set);
        System.out.println("size:"+set.size());
        //search 
        if(set.contains(1)){
            System.out.println("yes contain 1");
        }
        if(!set.contains(6)){
            System.out.println("doesNot present");
        }
        //delete
        set.remove(1);
        System.out.println(set);
        if(!set.contains(1)) {
           System.out.println("absent");
       }
        //Iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        if(!set.isEmpty()) {
           System.out.println("set is not empty");
       }


    }
}
