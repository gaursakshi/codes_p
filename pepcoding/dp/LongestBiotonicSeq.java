class LongestBiotonicSeq
{
    public static  void main(String args[])
    {
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        
        System.out.println(LBS(arr));

    }

    public static  int[] LIS(int []arr)
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
        return dp;

        /*for(int i=0;i<dp.length;i++)
        {
            System.out.print(dp[i]+" ");
        }*/
    }

    public static int [] LDS(int []arr)
    {
        int max=0;
        //dp creation
        int []dp=new int [arr.length];
        for ( int i = 0; i < arr.length; i++ ) 
        dp[i] = 1; 

        //similar to LIS

        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]<arr[j])
                {
                    dp[i]=Math.max(dp[i], dp[j]+1);
                    max=Math.max(max,dp[i]);
                }
                max=Math.max(max,dp[i]);
            }
        }
 return dp;

    }

    public  static int LBS(int []arr)
    {
        int ans=0;
        int dp[]=new int [arr.length];

        int lis_result[]=LIS(arr);
        int lds_result[]=LDS(arr);
        //ans=(lis_result+lds_result)-1;

        int myans=0;
        int max=0;


        for(int i=0;i<arr.length;i++)
        {
              dp[i]=lis_result[i]+lds_result[i]-1;
              max=Math.max(max,dp[i]);   

        }
        return max;



       

    }

}