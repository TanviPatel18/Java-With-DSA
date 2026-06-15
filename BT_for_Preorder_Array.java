import java.util.*;
public class BT_for_Preorder_Array {
     static class Node{
        int data;
        Node left ,right;
        Node(int data)
        {
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class Binarytree
    {
        static int idex=-1;
        public static Node buildTree(int nodes[])
        {
            idex++;
            if(nodes[idex]==-1)
            {
                return null;
            }
            Node newnode = new Node(nodes[idex]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);

            return newnode;
        }
    }
     public static void preorder(Node root) 
    {
        if(root==null)
        {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void postorder(Node root) 
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void Inorder(Node root) 
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree =new Binarytree();
        Node root=tree.buildTree(nodes);
        System.out.println("root data :- "+root.data); // Output: 1

        System.out.print("preorder:-");preorder(root);
        System.out.println();
        System.out.print("postorder:-");postorder(root);
        System.out.println();
        System.out.print("Inorder:-");Inorder(root);


    }
}
