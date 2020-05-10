import java.lang.*;

public class LPS
{
    public static void main(String args[])
    {touc
        String str="abcb";
       
        //palindromeSubstring(str);
        //int result=longestPalindromicSubstring(str);
       // int result=longestPalindromicSubsequnces(str);
      
        int result=countPalindromicSubsequences(str);
        System.out.println(result);
        
    }


    public static boolean [][] palindromeSubstring(String str)
    {
        boolean dp[][]=new boolean [str.length()][str.length()];
        

        for(int gap=0;gap<str.length();gap++)
        {
            for(int i=0, j=gap;j<str.length();i++,j++)
            {

                if(gap==0)
                {
                    dp[i][j]=true;
                    continue;
                }


                else if(str.charAt(i)==str.charAt(j))
                {
                    if(gap==1)
                    {
                        dp[i][j]=true;
                   
                    }
                    else
                    {
                        dp[i][j]=dp[i+1][j-1];
                    }

                    
                }

            }
        }

       /* for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
           
        }*/
        return dp;
    }



    public static int longestPalindromicSubstring(String str)
    {
        //dp initialise 
        int dp[][]=new int [str.length()][str.length()];
       boolean result[][]=palindromeSubstring(str);

        for(int gap=0;gap<str.length();gap++)
        
        {

            for(int i=0,j=gap;j<str.length();i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=1;

                }


                else if(str.charAt(i)==str.charAt(j))
                {
                        if(gap==1)
                        {
                            dp[i][j]=2;
                        }

                        else if(result[i+1][j-1])
                        {
                            dp[i][j]=dp[i+1][j-1]+2;
                        }
                    

                }
                else
                {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }

        }
        return dp[0][str.length()-1];

        
    }


    public static int longestPalindromicSubsequnces(String str)
    {
        int [][]dp=new int [str.length()][str.length()];

        for(int gap=0;gap<str.length();gap++)
        {
            for(int i=0,j=gap;j<str.length();j++,i++)
            {
                if(gap==0)
                {
                    dp[i][j]=1;
                }

                else if(str.charAt(i)==str.charAt(j))
                {
                    dp[i][j]=dp[i+1][j-1]+2;
                }

                else
                {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }

        return dp[0][str.length()-1];

    }

    public static int countPalindromicSubsequences(String str)
    {

        int dp[][]=new int [str.length()][str.length()];

        for(int gap=0;gap<str.length();gap++)
        {
            for(int i=0,j=gap;j<str.length();i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=1;
                }

                //2 cases
                //////////////////////1 case 
                else if(str.charAt(i)!=str.charAt(j))
                {
                    dp[i][j]+=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
                }
                else
                {
                    //when both character are included 
                    dp[i][j]+=dp[i+1][j-1]+1;

                    //when both  characters are not included
                    //when one character is included from first and last at a time
                    dp[i][j]+=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];

                }


            }

        }
        return dp[0][str.length()-1];


    }
}