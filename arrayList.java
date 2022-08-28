import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<String> list2 = new ArrayList<String>();
       ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      //add elements
      list.add(1);
      list.add(2);
      list.add(3);
        System.out.println(list);
        //get elements
        int ele=list.get(0);
        System.out.println(ele);
        //add element in between..new element entry
        list.add(0,0);
        System.out.println(list);
        //set element....changing
        list.set(0,5);
        System.out.println(list);
        //delete element
        list.remove(3);
        System.out.println(list);
        //size in array
        int size=list.size();
        System.out.println(size);
        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //soting
        Collections.sort(list);
        System.out.println(list);

    }
}
