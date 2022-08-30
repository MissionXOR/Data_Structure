package dsa;
//this is not for competetive or placement
public class LinkL {
    //create a node ... data,next
    Node head;
    private int size;
    LinkL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=next;
            size++;
        }
    }
    //add first and last
    //add first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
       if(head==null){
            System.out.println("the list is empty");
            return;
        } 
       size--; //single node er jonno upore nahole vhul hoito
        if(head.next==null){
            head=null;
        }
       //travarse the list
       Node secondLast=head;
       Node lastNode=head.next;
       while(lastNode.next!=null){
           lastNode=lastNode.next;
           secondLast=secondLast.next;
       }
       secondLast.next=null;
    }
    //print list
    public void printList(){
        if(head==null){
            System.out.println("the list is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data +" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LinkL l=new LinkL();
        l.addFirst("a");
        l.addFirst("is");
        l.printList();
        l.addLast("list");
        l.printList();
        l.addFirst("this");
        l.printList();
        l.deleteFirst();
        l.printList();
        l.deleteLast();
        l.printList();
        System.out.println("Node size: "+l.getSize());
       
    }
 
}
