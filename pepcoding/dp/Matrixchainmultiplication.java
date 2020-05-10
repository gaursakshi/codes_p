public class Matrixchainmultiplication 
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 3};
         
       int result=MCM_memo(arr, 0, arr.length-1, ans);
       System.out.println(result);
      
    }


    public static int  MCM_memo(int arr[],int start,int end)
    {
       String ans[][]=new String [arr.length][arr.length];
        int dp[][]=new int [arr.length][arr.length];

 
        if(start+1==end)
        {
           
            return 0;
        }
        if (dp[start][end] != 0)
        return dp[start][end];

        int min=Integer.MAX_VALUE;


        for(int cut=start+1;cut<end;cut++)
        {
            int left=MCM_memo(arr, start, cut); 
            int right=MCM_memo(arr, cut, end);
            int mycost=left+(arr[start]*arr[cut]*arr[end])+right;

            if (cost < min)
            {
                min = cost;
                ans[start][end] = "(" + ans[start][cut] + ans[cut + 1][end] + ")";
            }


        }
        dp[start][end] = min;
    return min;

    }
    

}