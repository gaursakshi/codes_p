class pdi
{
    public static void main(String args[])
    {
        solve();

    }

    public static void solve()
    {
        int n=5;
        //printDecreasingIncreasing(n);
        printIncreasingDecreasing(n,1);

    }

    public static void printDecreasingIncreasing(int n)
    {

        if(n==0)
        {
            return ;
        }


        System.out.println(n);
        printDecreasingIncreasing(n-1);

        System.out.println(n);
    }


    
    public static void printIncreasingDecreasing(int n,int counter)
    {

        if(n+1==counter)
        {
            return ;
        }


        System.out.println(counter);
        printIncreasingDecreasing(n,counter+1);
        
        System.out.println(counter);
    }


}