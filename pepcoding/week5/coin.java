import java.util.Scanner;
class coin
{
    public static int perumuationInfinteCoin(int arr[],int target,String ans)
    {
        if(target==0)
        {
            System.out.println(ans);
            return 1;
        }

        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(target-arr[i]>0)
            {
                count+=perumuationInfinteCoin(arr,target-arr[i],ans+arr[i]);
            }
           
        }
         return count;
    }


    public static int combinationInfinteCoin(int arr[]int idx,int target,String ans)
    {
        if(target==0)
        {
            System.out.println(ans);
            return 1;
        }

        int count=0;

        for(int i=idx;i<arr.length;i++)
        {
            if(target-arr[i]>0)
            {
                count+=combinationInfinteCoin(arr,i,target-arr[i],ans+arr[i]);
            }
           
        }
         return count;
    }
    

    public static int combinationSingleCoin(int arr[]int idx,int target,String ans)
    {
        if(target==0)
        {
            System.out.println(ans);
            return 1;
        }

        int count=0;

        for(int i=idx;i<arr.length;i++)
        {
            if(target-arr[i]>0)
            {
                count+=combinationInfinteCoin(arr,i,target-arr[i],ans+arr[i]);
            }
           
        }
         return count;
    }
    public static  void  basicQues()
    {
        int arr[]=new int[]{2,3,5,7};
        System.out.println( perumuationInfinteCoin(arr,10,""));
         System.out.println( combinationInfinteCoin(arr,0,10,""));

    }
    public static void solve()
    {
        basicQues();
    }
    public static void main(String args[])
    {
        solve();

    }

}