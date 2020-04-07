public class factorial
{
    public static void main(String args[])
    {
        solve();
    }


    public static void solve()
    {
        int n=5;
        int result=factorial(n);
        System.out.println(result);

    }

    public static int factorial(int n)
    {

        if(n==0)
        {
            return 1;
        }

        //faith
        int fact=factorial(n-1);
        //expectation
        int result=n*fact;

        return result;

    }

}