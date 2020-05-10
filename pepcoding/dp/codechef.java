
public class codechef
{
    public static void main(String args[])
    {
        //int arr[]={1 ,0 ,0, 0, 0, 0, 1};
        int arr[]={1,0,1};
        
        System.out.println(solve(arr));
    }


    public static boolean solve(int arr[])
    {
        boolean ans=true;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==1 && arr[j]==1)
                {
                    int result=j-i;
                    if(result<6)
                    {
                        ans=false;
                    }
                   
                }
              
            }

        }
        return ans;
        
    }

}