public class Tree_methods {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
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
    public static int sumNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        return sumNodes(root.left)+ sumNodes(root.right)+ root.data;
    }

    public static int countNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter,Math.max(leftDiameter, rightDiameter));
    }
    public static void main(String[] args)
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);

        System.out.println("Height = " + height(root));
        System.out.println("Count = " + countNodes(root));
        System.out.println("Sum = " + sumNodes(root));
        System.out.println("Height = " + height(root));
        System.out.println("Diameter = " + diameter(root));
    }
}