public class queue
{

    int []que;
    int head=0;
    int tail=-1;
    int size=0;

    queue()
    {
        this.que=new int[10];
    }

    queue(int size)
    {
        this.que=new int[size];
    }

    queue(int[]arr)
    {
        this.que=new int[arr.length*2];
        for(int i=0;i<arr.length;i++)
        {
            this.que[i]=arr[i];
        }
        this.tail=arr.length-1;

         
    }


    public int size()
    {
        return this.size;
    }


    public boolean isEmpty()
    {

        //size check
        if(this.size()==0)
        {
            return true;
        }
        else
        {
            return false;

        }
    }

    public void push(int data)
    {
        if(this.size()==que.length)
        {
            System.out.println("queue is full");
            return ;
        }
        this.tail=(this.tail +1) % this.que.length;
       this. que[tail]=data;
       this.size++;

    }


    public int front()
    {

        if(this.size()==0)
        {
            System.out.println("queue is empty");
            return -1;
        }

        return que[this.head];
    }

    public int pop()
    {
        if(this.size()==0)
        {
            System.out.println("queue is empty");
            return -1;
        }

        int returnvalue=que[this.head];
        this.que[this.head]=0;
        this.size--;

        this.head=(this.head+1)% this.que.length;

         return returnvalue;

        

    }

    public void display()
    {
        for(int i=0;i<this.size;i++)
        {
            int val=this.que[(this.head+i)%que.length];
            System.out.println(val);
        }

    }



}