import java.util.ArrayList;
public class ab
{ 
    public static void main(String args[])
    {
    int target=5;
    int denom[]={2,5,2,1,2};
    //String  ans="";
    int lpi=0;
    Combination(denom,target,lpi,new ArrayList<Integer>());
    }

    static int count=0;

    public static void Combination(int[]denom,int target,int lpi,ArrayList<Integer>ans)
    {
        
        if(target==0)
        {
            //count++;
            //System.out.print(count+" ");
            System.out.println(ans);
            //ArrayList<Integer>
             return;
        }

        for(int install=lpi;install<denom.length;install++)
        {
            if(target>=denom[install])
            {
                ans.add(denom[install]);
                Combination(denom, target-denom[install], install,ans);
                ans.remove(ans.size()-1);
            }

        }
    }

}


