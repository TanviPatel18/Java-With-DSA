
//what is bst=binary search tree
// left node<root
// right node>root
// left &right subtree are also bst with no duplicates

// in order  traversal of bst gives a sorted sequence
//o(h) like n=8 h=8-1/2

//most of the problem will be solved using recursion (divid and conquer)



public class BST_OPRATION {
    // build  a bst
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node Insert(Node root, int val)
    {

        if(root == null)
        {
            return new Node(val);
        }
        if(root.data>val)
        {
            root.left=Insert(root.left,val);
        }
        else{
            root.right=Insert( root.right, val);
        }
        return root;
    }
    public  static boolean search(Node root,int key)
    {
        if(root ==null)
        {
            return false;
        }
        else if(root.data>key)
        {
            return search(root.left, key);
        }
        else if(root.data==key)
        {
            return true;
        }
        else 
        {
            return search(root.right, key);
        }
    }

//delete

    public static Node delete(Node root, int value)
    {
        //case 1 no child(leaf node)
        //case 2  one child
        //case 3 two children
        if(root.data > value)
        {
            root.left=delete(root.left, value);
        }
        else if(root.data< value)
        {
            root.right =delete(root.right, value);
        }
        else
        {
            //case 1

            if(root.left==null&& root.right ==null)
            {
                return null;
            }

            //case 2
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }

            //case 3
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);

        }
        return root;
    }
    public static Node inorderSuccessor(Node root)
    {
        while(root.left !=null)
        {
            root=root.left;
        }
        return root;
    }
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<value.length;i++)
        {
            root=Insert(root,value[i]);

        }

        System.out.println("Inorder Traversal:");
        Inorder(root);
        
        System.out.println(search(root, 3));

        delete(root, 4);
        Inorder(root);
    }   
}
