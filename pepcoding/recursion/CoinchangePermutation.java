
public class CoinchangePermutation 
{
    public static void main(String args[])
    {
        int amount=10;
        String ans="";
        int deno[]={2,3,5,6};
        int lpi=0;
        CoinchangePermutation(deno,amount,ans);
    }

    static int count=0;


    public  static  void CoinchangePermutation(int deno[],int amount,String ans)
    {
        if(amount==0)
        {
            count++;
            System.out.print(count+" ");
            System.out.println(ans);
        }


        for(int install=0;install<deno.length;install++)
        {
            if(amount>=deno[install])
            {
                CoinchangePermutation(deno,amount-deno[install],ans+deno[install]);
            }
        }


    }

}