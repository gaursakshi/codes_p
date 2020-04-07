public class printDecreasing
{
    public static void main(String args[])

    {

    solve();

    }

    public  static void solve()
    {
        int n=5;

         printDecreasing(n);
    }


    public static void printDecreasing(int n)
    {


        if(n==0)
        {
            return ;
        }
        System.out.println(n);

        //faith 

        printDecreasing(n-1);

    }
}