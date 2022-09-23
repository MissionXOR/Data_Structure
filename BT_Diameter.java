package dsa;

import static dsa.BT_Diameter.BinaryTree.diameter;
import static dsa.BT_Diameter.BinaryTree.diameter2;

public class BT_Diameter {
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
       
       //height tree
       public static int height(Node root){
           if(root==null){
               return 0;
           }
           int leftNode=height(root.left);
           int rightNode=height(root.right);
           int myHeight=Math.max(leftNode,rightNode)+1;
           return myHeight;
       }
       //Diameter of a tree
       //O(N^2)
       public static int diameter(Node root){
           if(root==null){
               return 0;
           }
           int Dia1=diameter(root.left);
           int Dia2=diameter(root.right);
           int Dia3=height(root.left)+height(root.right)+1;
           return Math.max(Dia3,Math.max(Dia1, Dia2));
       }
       
       //Diameter of tree Approach 2
       //O(N)
       static class TreeInfo{
           int ht;
           int dia;
           TreeInfo(int ht,int dia){
               this.ht=ht;
               this.dia=dia;
           }
       }
       public static TreeInfo diameter2(Node root){
           if(root==null){
               return new TreeInfo(0,0);
           }
           TreeInfo left=diameter2(root.left);
           TreeInfo right=diameter2(root.right);
           int myHeight=Math.max(left.ht,right.ht)+1;
           int dia1=left.dia;
           int dia2=right.dia;
           int dia3=left.ht+right.ht+1;
           int myDiam=Math.max(dia3,Math.max(dia1, dia2));
           TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
           return myInfo;
       }
   }
    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree b=new BinaryTree();
        Node root=b.buildTree(nodes);
        System.out.println("Diameter Of diameter1: "+diameter(root));
        System.out.println("Diameter of diameter2: "+diameter2(root).dia);
    }
 
}

