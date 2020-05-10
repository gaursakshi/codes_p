import java.util.Scanner;
public class basictree
{
    public static  class Node 
    {
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right)
        {
            this.data=data;
            this.left=left;
            this.right=right;

        }

        public Node(int data)
        {
            this.data = data;
        }
    }

    static Node root;
    static  int size;

    // public basictree() 
    // {

    //     // null is that node which will construct tree as it is having no parent
    //     Scanner sc = new Scanner(System.in);
    //     this.root = ConstructTree(sc, null, false);

    // }

    // exceptation ki create a left child when true is passed and right child when
    // false is passed
    /*private Node ConstructTree( Scanner sc,  Node parent, boolean ilc) 
    {
        if (parent == null)
         {
            System.out.println("enter the data for root");
            
        }
       

        else
        {

        // ilc==true left child create
            if (ilc) {
                System.out.println("enter the data for left child of parent" + parent.data);
               
            }

            else {
                System.out.println("enter the data for left child of parent" + parent.data);
                
            }   
        }
        int cdata = sc.nextInt();


        // creation of child Node
         Node child = new Node();
        child.data = cdata;

        this.size++;

        // asking the user for left child
        System.out.println("do you have the left child for the child" + child.data);

         Boolean hlc = sc.nextBoolean();

         if(hlc)
         {
            System.out.println("enter the data for left child of parent"+parent.data);

            //faith tree will construct for left child
            child.left=ConstructTree(sc, child,hlc);
             
         }
         else
         {
              //faith tree will construct for right child
             child.right=ConstructTree(sc, child, hlc);
         }

         return child;



     }*/

     

      public static void  display(Node root)
      {

        if(root ==null)
        {
            
            return;
        }
        if(root.left!=null)
        System.out.print(root.left.data+" -> ");
        System.out.print(root.data+" -> ");
        if(root.left!=null)
        {
            System.out.print(root.right.data);

        }
        System.out.println();

          display(root.left);
          display(root.right);
      }
     public int size()
     {
         return this.size++;
     }


     //doubt isempty

     public boolean isEmpty()
     {
         return this.size()==0;
     }

     static  int idx=0;

     public static Node  createTree(int[]arr)
     {
        //base case
        if(idx>=arr.length || arr[idx]==-1)
        {
            idx++;
            return null;
        }

        Node node = new Node(arr[idx]);
        idx++;
        node.left=createTree(arr);
        node.right=createTree(arr);
        return node;
     
     }


     public static void solve()
     {
          int[] arr = { 10, 20, 30, 40, -1, -1, 50, -1, -1, 60, -1, 70, -1, -1, 80, 90,
        100, 120, -1, -1, 130, -1, -1,
        110, -1, -1, 140, -1, -1 };

        Node root=createTree(arr);
        display(root);
     }

     public static void main(String args[])
     {
         solve();
     }
}