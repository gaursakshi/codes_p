public class evenodd
{
    public static void main(String args[])
    {

        int n=8;
        evenodd(n);

    }

    public static void evenodd(int n)
    {
       if(n==0)
       {
           System.out.println(n);
           return ;
       } 

        if((n&1)==0)
        {
            System.out.println(n);

        }
        evenodd(n-1);

        if((n&1)!=0)
        {
            System.out.println(n);

        }
    }
}