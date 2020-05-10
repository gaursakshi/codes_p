public class linkedListImplementation
{
    private class Node
    {
        int data;
        Node next;

        //constructor
        Node(int data)
        {
            this.data=data;

        }

        @Override
        public String toString()
        {
            return this.data+" ";
        } 



    
    }


    ///defination of head,tail
    private Node head=null;
    private Node tail=null;
    private int nodecount=0;

    //basic functions
    //size function
    public int size()
    {
        return this.nodecount;
    }


    //empty function

    public int isEmpty()
    {
        return this.nodecount==0;
    }


    //add function

    //add at first


    public void addFirst(Node node)
    {
        if(nodecount==0)
        {
            this.tail=node;
        }
        newnode.next=head;
        this.head=newnode;
        this.nodecount++;

    }



    public void add(int val)
    {
  
        Node newnode=new Node(val);
        addFirst(newnode);
      
    }


    public void addLast(int val)
    {
        
    }




}