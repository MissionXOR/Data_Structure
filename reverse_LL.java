package dsa;
public class reverse_LL {
    //create a node ... data,next
    Node head;
    private int size;
    reverse_LL(){
        this.size=0;
    }
    class Node{
        int  data;
        Node next;
        Node(int  data){
            this.data=data;
            this.next=next;
            size++;
        }
    }
    public void addFirst(int  data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
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
    public void reverseList() {
       if(head == null || head.next == null) {
           return;
       }
       Node prevNode = head;
       Node currNode = head.next;
       while(currNode != null) {
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
   }
    public Node reverseRecuesive(Node head){
       if(head == null || head.next == null) {
           return head;
       } 
       Node newNode=reverseRecuesive(head.next);
       head.next.next=head;
       head.next=null;
       return newNode;
    }
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
    public static void main(String[] args) {
        reverse_LL p=new reverse_LL();
        p.addLast(1);
        p.addLast(2);
        p.addLast(3);
        p.addLast(4);
        p.printList();
      //  p.reverseList();
        p.head=p.reverseRecuesive(p.head);
        p.printList();
    }
}
