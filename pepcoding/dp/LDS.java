import java.util.Arrays;

class LDS
{
    public static void main(String args[])
    {
        int arr[] = { 15, 27, 14, 38, 63, 55, 46, 65, 85 };
        System.out.println(LDS(arr));

    }

 
    public static int  LDS(int []arr)
    {
        int max=0;
        //dp creation
        int []dp=new int [arr.length];
        Arrays.fill(dp, 1);
tou
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
 return max;

    }
}