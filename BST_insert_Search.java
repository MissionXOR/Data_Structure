package dsa;

public class BST_insert_Search {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
        
    }
    public static Node insert(Node root,int val){
        if(root==null){
             root=new Node(val);
             return root;
        }
        if(root.data>val){
            //left subtree
           root.left= insert(root.left,val);
        }else{
           root.right= insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    // search BST
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else if(root.data==key){
            return true;
        }else{
            return search(root.right,key);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data>val){
           root.left=delete(root.left,val);
        }else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{
            //root.data==val
            //case:1
            if(root.left==null && root.right==null){
                return null;
            }
            //case:2
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case:3
            Node IS=inorderSuccesser(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inorderSuccesser(Node root){
        while(root.left!=null){
           root=root.left;
           
        }
        return root;
    }
    //print in range
    public static void printRange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            printRange(root.left,x,y);
            System.out.print(root.data+" ");
            printRange(root.right,x,y);
            
        }
        else if(root.data>=y){
            printRange(root.left,x,y);
            
        }
        else{
            printRange(root.right,x,y);
        }
        
    }
    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        
        for(int i=0;i<value.length;i++){
            root=insert(root,value[i]);
        }
        inorder(root);
        System.out.println();
        //search
        if(search(root,10)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
        System.out.println(".....................");
        //delete a node
        delete(root,5);
        inorder(root);
        System.out.println();
        System.out.println("......print in range.......");
        printRange(root,6,12);
    }
 
}
