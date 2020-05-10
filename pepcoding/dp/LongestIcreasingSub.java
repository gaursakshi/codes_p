class LongestIcreasingSub
{
    public static void main(String args[])
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        
        //int arr[]={3,3,3,3};

        int result=LIS(arr);
        System.out.println(result);
    }

    public static  int LIS(int []arr)
    {
        int max=0;
        int []dp=new int[arr.length];
        for ( int i = 0; i < arr.length; i++ ) 
        dp[i] = 1; 


        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    max=Math.max(dp[i],max);
                }
              
                max=Math.max(dp[i],max);
            }
        }
        return max;

        /*for(int i=0;i<dp.length;i++)
        {
            System.out.print(dp[i]+" ");
        }*/
    }
}