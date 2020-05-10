import java.util.NoSuchElementException;
public class linkedlist{

    private class Node{
        int data=0;
        Node next=null;

        Node(int data){
            this.data=data;
        }

        @Override
        public String toString(){
             return this.data + "";
        }
    }

    private Node head=null;
    private Node tail=null;
    private int nodeCount=0;

    //basic funtions.========================================

    public int size(){
        return this.nodeCount;
    }

    public boolean isEmpty(){
        return this.nodeCount==0;
    }


    

    public Node getNodeAt(int idx){
        if(idx<0 || idx>=this.nodeCount){
            throw new NullPointerException();
        }

        Node curr=this.head;
        while(idx-->0){
            curr=curr.next;
        }        
         
        return curr;
    }
    

    // Add.==================================================

    private void addFirstNode(Node node){
          if(this.nodeCount==0){
              this.tail=node;
          }

          node.next=this.head;
          this.head=node;
          this.nodeCount++;
    }

    public void addFirst(int data){
        Node node=new Node(data);
        addFirstNode(node);
    }

    
    private void addLastNode(Node node){
        if(this.nodeCount==0){
            this.head=node;
            this.tail=node;
        }else
        {
            this.tail.next=node;
            this.tail=node;
        }
        
        this.nodeCount++;
    }

    public void addLast(int data){
       Node node=new Node(data);
       addLastNode(node);
    }

    private void addAtNode(Node node,int idx)
    {
        if(this.nodeCount==0)
        {
            this.head=node;
            this.tail=node;

        }
        if(idx==0)
        {
            addFirst(data);
        }

        else if(idx==this.nodeCount)
        {
            addLast(data);
        }

        else
        {
            Node indexprevious=getNodeAt(idx-1);
            Node node.next=indexprevious.next;

            indexprevious.next = node;
            this.nodeCount++;


        }

    }

    public void addAt(int data,int idx)
    {
        if (idx > this.nodeCount || idx < 0)
            return;
            addAtNode(node, idx);

    }

    //get.=================================================

    public int getFirst(){
        if(this.nodeCount==0) throw new NoSuchElementException();
        return this.head.data;
    }

    
    public int getLast(){
        if(this.nodeCount==0) throw new NoSuchElementException();
        return this.tail.data;
    }

    
    public int getAt(int idx){
        return getNodeAt(idx).data; 
    }

    //remove==================================================

    private Node removeFirstNode(){
        Node rn=this.head;

        if(this.nodeCount==1){
           this.head=null;
           this.tail=null;
       }else{
           this.head=this.head.next;
       }

       rn.next=null;
       this.nodeCount--;
       return rn;
    }

    public int removeFirst()
    {
        if(this.nodeCount==0) throw new NoSuchElementException();
        return removeFirstNode().data;
    }

    
    private Node removeLastNode()
    {
        Node rn=this.tail;

        if(this.nodeCount==1){
           this.head=null;
           this.tail=null;
       }else{
         Node secondLast=getNodeAt(this.nodeCount-2);
         this.tail=secondLast;
         tail.next=null;      
       }

       rn.next=null;
       this.nodeCount--;
       return rn;
    }

    public int removeLast()
    {
        if(this.nodeCount==0) throw new NoSuchElementException();
        return removeLastNode().data;
    }

    private Node removeAtNode(int indx)
    {
        if (idx >= this.nodecount || idx < 0)
            return null;
        if (idx == 0)
            removefirst();
        else if (idx == this.nodecount - 1)
            removeLast();
        else
        {
            Node prev = getNodeAt(idx - 1);
            Node forward = prev.next;

            prev.next = forward.next;
           this.nodecount--;
           
        }



     }
 
     public int removeAt(int idx)
     {
         if(this.nodeCount==0) throw new NoSuchElementException();
         return removeAtNode().data;
     }


}