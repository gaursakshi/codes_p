public class Detection
{
    public class Node
    {
        int data=0;
        Node next;
    

        Node(int data)
        {
            this.data=data;
        }
    }

    public  Node head=null;

    public static  boolean hasCycle(Node head) 
    {
        boolean ans=false;
        if (head == null || head.next == null) {
        return false;
    }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                ans=true;
                break;
            }
        }
       
        
      return ans;
    }
   public void addFirstNode(Node head ,int data)
   {
       Node node=new Node(data); 
        node.next=head;
        head=node;
       
  }


  public static void main(String args[])
  {
      Detection obj=new Detection();
      Node head=null;
      obj.addFirstNode(head,30);
	  obj.addFirstNode(head,46);
	  obj.addFirstNode(head,1);
      obj.addFirstNode(head,99);

      //creation of cycle
      obj.head.next.next.next.next =head; 
      boolean ans=hasCycle(head);
     if(ans==true)
     {
         System.out.println("cycle exist");
     }
     else
     {
        System.out.println("No cycle exist");


     }
      

      

  }
  



    


     
}