public class minJump
{
        public static void main(String []args)
    {
        int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 }; 
        

        //int n=0;
        //int result=minJump_normalRecursion(arr,0);

        int dp[]=new int[arr.length];

        int result=minJump_memoisation(arr,0,dp);
        System.out.println(result);



    }


    public  static int minJump_normalRecursion(int arr[],int idx)
    {
        //base case
        if(idx==arr.length-1)
        {
            return 0;   //0 jump

        }


        //initial one  jump hogi

        int min=Integer.MAX_VALUE;

        for(int jump=1;jump<=arr[idx] && jump +idx<arr.length;jump++)
        {
            int minjump=minJump_normalRecursion(arr, idx+jump);



            if(minjump<min)
            {
                min=minjump;
            }

        }
        return min+1; //khud ki ek jump
        
    }


    /////////////////////memoisation
    static int minJump_memoisation(int arr[],int index,int[]dp)
    {
        if(index==arr.length-1)
        {
            dp[index]=0;
            return dp[index];
        }


        if(dp[index]!=0)
        {
            return dp[index];
        }

        int min=Integer.MAX_VALUE;

        for(int jump=1;jump<=arr[index] && jump+index<arr.length;jump++)
        {
            int minjump=minJump_memoisation(arr, index+jump, dp);

            if(minjump<min)
            {
                min=minjump;
            }
        }

        dp[index]=min+1;
        return dp[index];
    }




//tabulation 
public static int minJump_tabulation(int ar[],int  index,int []dp)
{
    dp[arr.length-1]=0; 
    int min=Integer.MAX_VALUE;
    //when the elements is zero

    if(arr[idx]==0)
    {
        dp[idx]=Integer.MAX_VALUE;
        continue;
    
    }
    for(int i=arr.length-2;i>=0;i--)
    {
        for(int jump=1;jump<=arr[index] && jump+index<arr.length;jump++)
        {
            minjump=Math.min(min,dp[i+jump]);

            if(minjump<min)
            {
                min=minjump;
            }
            

        }
        dp[i]=min+1;
    
    }
    return dp[0];

    
    
}




