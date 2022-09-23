package dsa;

import static dsa.BT_sumOfNodes_height.BinaryTree.height;
import static dsa.BT_sumOfNodes_height.BinaryTree.sumNode;

public class BT_sumOfNodes_height {
    //Node class 
    
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
   //build binary tree
     
   static class BinaryTree{
           static int idx = -1;
       public static Node buildTree(int nodes[]){
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]); 
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;

       }
       //sum of nodes 
       
       public static int sumNode(Node root){
           if(root==null){
               return 0;
           }
           int leftNode=sumNode(root.left);
           int rightNode=sumNode(root.right);
           return leftNode+rightNode+root.data;
       }
       //height of Node 
       
       public static int height(Node root){
           if(root==null){
               return 0;
           }
           int leftNode=height(root.left);
           int rightNode=height(root.right);
           int myHeight=Math.max(leftNode,rightNode)+1;
           return myHeight;
       }
   }
    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree b=new BinaryTree();
        Node root=b.buildTree(nodes);
        System.out.println("Sum of Nodes:"+sumNode(root));
        System.out.println("Height of Nodes:"+height(root));
    }
}
