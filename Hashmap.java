package dsa;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<> ();
        //country(key), Integer(value)
        
        //insertion 
        map.put("Bangaldesh",12);
        map.put("india",150);
        map.put("china",210);
        System.out.println(map);
        //duplicate value always uptdate the old value
        map.put("india",300);
        System.out.println(map);
        //search 
        if(map.containsKey("india")){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
        //get() take the value for a key
        System.out.println(map.get("india"));
        System.out.println(map.get("dhaka"));
        //iteration 
        int arr[]={12,14,16};
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //new iteration 
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        //iteration using ENTRY set
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //iteration using KEY Set
        Set<String> key=map.keySet();
        for(String val:key){
            System.out.println(val+" "+map.get(val));  
        }
        map.remove("india");
        System.out.println(map);
    }
}
