class power
{
    public static void main(String args[])
    {

        int x=3;
        int n=4;
        //int result=power(x,n);

        int result=optimisedPower(x, n);
        System.out.println(result);
    }

    public static int power(int x,int n)
    {

        //base 
        if(n==0)
        {
            return 1;
        }


        //faith
        int p=power(x,n-1);

        //expectation
        int result=x*p;
        

        return result;


    }

     public static int optimisedPower(int x,int n)
     {
         //faith if (n is even)


         if(n==0)
         {
             return 1;
         }

         if((n & 1)==0)
         {
             int x1=optimisedPower(x, n/2);
             int result=x1*x1;
             return result;


         }

         else
         {

            int x1=optimisedPower(x, n/2);
            int result=x1*x1*x;
            return result;

         }
     }

}