public class avltree
{
    public static class Node
    {
       
        int data = 0;
        Node left = null;
        Node right = null;


        int height=-1;
        int bal=0;


        
        public Node() 
        {

        }

        public Node(int data) 
        {
            this.data = data;
        }

        public Node(int data, Node left, Node right)
         {
            this.data = data;
            this.left = left;
            this.right = right;
        }


        @Override
        public String toString()
         {

            String str = "";
            str += ((left != null ? left.data : "."));
            str += (" -> " + data + " <- ");
            str += ((right != null ? right.data : "."));
            str += "\n";

            if (left != null)
                str += left.toString();
            if (right != null)
                str += right.toString();

            return str;
        }



    }


    public static Node BSTCreate(int[] arr, int si, int ei)
     {
        if (si > ei)
            return null;
        int mid = (si + ei) >> 1; // si + (ei-si)/2;
        Node node = new Node(arr[mid]);

        node.left = BSTCreate(arr, si, mid - 1);
        node.right = BSTCreate(arr, mid + 1, ei);

        return node;
    }

    public static void display(Node node) {
        if (node == null)
            return;

        System.out.print((node.left != null ? node.left.data : "."));
        System.out.print(" -> " + node.data + " <- ");
        System.out.println((node.right != null ? node.right.data : "."));

        display(node.left); // display(2*idx+1);
        display(node.right); // display(2*idx+2);

    }




    public static Node addData(Node node, int data)
     {
        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.left = addData(node.left, data);
        else
            node.right = addData(node.right, data);

        node=rotation(node);
        return node;
    }

    public static int maxInTree(Node root)
    {
        if (root == null)
            return Integer.MIN_VALUE;

        Node rnode = root;
        while (rnode.right != null) {
            rnode = rnode.right;
        }

        return rnode.data;
    }

    

    public static Node removeNode(Node node, int data) {
        if (node == null)
            return null;

        if (node.data == data) {
            if (node.left == null || node.right == null) {
                return node.left == null ? node.right : node.left;
            }

            int maxdata = maxInTree(node.left);
            node.data = maxdata;

            node.left = removeNode(node.left, maxdata);
        } else if (data < node.data)
            node.left = removeNode(node.left, data);
        else
            node.right = removeNode(node.right, data);


        node=rotation(node);
        return node;
    }


    public static Node LL(Node x)
    {
        Node y=x.left;
        Node y_right=y.right;
        y.right=x;
        x.left=y_right;

        UpdateHeightBalace(x);
        UpdateHeightBalace(y);
        return y;

    }


    public static Node RR(Node x)
    {
        Node y=x.right;
        Node yleft=y.left;
        y.left=x;
        x.right=yleft;

        UpdateHeightBalace(x);
        UpdateHeightBalace(y);
        return y;

    }
      
    public static int BalanceFactor(Node node)
    {
        int left=node.left.height;
        int right=node.right.height;

        return left-right;

    }


    public static Node rotation(Node node)
    {
        UpdateHeightBalace(node);
        if(node.bal==2) //ll//lr
        {
            if(node.left.bal==1)
            {
                return LL(node);

            }


            else
            {
                node.left=RR(node.left);
                return LL(node);
            }
        }


        else if(node.bal==-2)
        {
            if(node.right.bal==-1)
            {
                return RR(node);
            }

            else
            {
                node.right=LL(node.right);
                return RR(node);

            }

        }
        return node;


    }


    public static void UpdateHeightBalace(Node node)
    {

        int lh=-1;
        int rh=-1;

        if(node.left!=null)
        {
            lh=node.left.height;
            
            //leaf nhi h 
        }

        if(node.right!=null)
        {
            rh=node.right.height;
        }

        node.height=Math.max(lh,rh)+1;
        node.bal=lh-rh;

        
    
}
public static void main(String args[])
{
    Node root=null;
    int[] arr = new int[10];
       for (int i = 0; i < 10; i++)
        {
           arr[i] = (i + 1) * 10;
       }

       root = BSTCreate(arr, 0, arr.length - 1);
       //display(root);
     root=  addData(root, 110);
       display(root);

       
      
       

}
}


   