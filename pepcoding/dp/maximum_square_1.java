class maximum_square_1
{
    public static void main(String args[])
    {
        int M[][] = {{0, 1, 1, 0, 1},  
        {1, 1, 0, 1, 0},  
        {0, 1, 1, 1, 0}, 
        {1, 1, 1, 1, 0}, 
        {1, 1, 1, 1, 1}, 
        {0, 0, 0, 0, 0}};
        
    
        
        int dp[][]=new int[M.length][M.length];

       printSquare(M,0,0,dp);
        System.out.println(maxSquare);

        display(dp);
    }


    public static void display(int M[][])
    {
        for(int i=0;i<M.length;i++)
        {
            for(int j=0;j<M[0].length;j++)
            {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
           
        }

    }


    static int maxSquare=0;
    public static int printSquare(int[][]arr,int row ,int col,int[][]dp)
    { //base case

       

        if(row==arr.length||col==arr[0].length)
        {
            return 0;

        }


        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        



        int right=printSquare(arr,row,col+1,dp);
        int diagonal=printSquare(arr, row+1, col+1,dp);
        int down =printSquare(arr, row+1, col,dp);
        int min_till_now=0;


        if(arr[row][col]==1)
        {
            min_till_now=Math.min(right,Math.min(diagonal,down));


        }



        dp[row][col]=min_till_now+1;

        maxSquare=Math.max(dp[row][col],maxSquare);

        
        


    
    return dp[row][col];
}



}