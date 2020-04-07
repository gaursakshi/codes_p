public class printIncreasing
{
    public static void main(String args[])
    {
        solve();
    }

    public static void solve()
    {touc
        int n=5;
        printIncreasing(n);
    }


    public static void printIncreasing(int n)
    {

        if(n==0)
        {
            return ;
        }
        //line1
        printIncreasing(n-1);

        ///line2
        System.out.println(n);


    }

}