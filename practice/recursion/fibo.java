class fibo
{
    public static void main(String args[])
    {
        int n=7;

        int result=fibo(n);
        System.out.println(result);
    }


    public static int fibo(int n)
    {
        if(n<=1)
        {
            return n;

        }

        int result=fibo(n-1);
        int result1=fibo(n-2);

        return (result+result1);

        
    }
}