
public class CoinchangeCombination
{ 
    public static void main(String args[])
    {
    int target=10;
    int denom[]={2,3,5,6};
    String  ans="";
    int lpi=0;
    Combination(denom,target,lpi,ans);
    }

    static int count=0;

    public static void Combination(int[]denom,int target,int lpi,String ans)
    {
        
        if(target==0)
        {
            count++;
            System.out.print(count+" ");
            System.out.println(ans);
            return;
        }

        for(int install=lpi;install<denom.length;install++)
        {
            if(target>=denom[install])
            {
                Combination(denom, target-denom[install], install, ans+denom[install]);
            }

        }
    }

}


