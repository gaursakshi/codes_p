public  class stack
{
    //array implementation using stack 
    private int st[];
    private int tos=-1;//default size 

    //constructor of stack

    stack()
    {

        this.st=new int [10];
    }

    stack(int size)
    {
        this.st=new int [size];
    }

    stack(int arr[])
    {
        this.st=new int [2*arr.length];  //size is doubled for stack onw operations
        for(int i=0;i<arr.length;i++)

        {
            this.st[i]=arr[i];

        }

        //top of stack should also be changed
        this.tos=arr.length-1;
    }

    public boolean isEmpty()
    {
        if(tos==-1)
        
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

        if(tos+1==st.length)
        {
            System.out.println("stack is full "+ tos);  //similar to null pointer exception
            return ;
        }
        ++tos;
        st[tos]=data;
       

    }

public int pop()
{
       if(tos==-1)
       {
           System.out.println("stack is empty");
           return -1;
       }

       return st[tos--];



}


    public int top()
    {

        if(tos==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }

        return st[tos];


    }

    public int size()
    {

        return tos+1;
    }
}