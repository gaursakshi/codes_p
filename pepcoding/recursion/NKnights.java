import java.util.Scanner;
public class NKnights
{
    public static void main(String args[])
    {
        int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the chess board size\t");
       n=sc.nextInt();
        
        boolean chess[][]=new boolean[n][n];
        int qpsf=0;
        int  index=-1;  //first queen should sit on 0 place
        String ans="";
        Nknights(chess,qpsf,ans,index);

    }

    public static int count1=0;
    public static void Nknights(boolean chess[][],int qpsf,String ans,int index)
    {
        int n=chess.length;

        if(qpsf==n)
        {
            //this will encounter only correct bases cases
                count1++;
                System.out.print(count1 +" ");
                System.out.println(ans);
            
            return;
        }


        for(int b=index+1;b<n*n;b++)
        {
            int row=b/n;
            int col=b%n;
            if(chess[row][col]==false)
            {
                //checking the queen is safe
               if(IsTheKnightSafe(chess,row,col)==true) 
               {
                chess[row][col]=true;
                Nknights(chess, qpsf+1, ans+" q"+(qpsf+1)+" b"+b,b);
                chess[row][col]=false;
               }
                

            }
        }
    }


    public static  boolean IsTheKnightSafe(boolean chess[][],int row,int col)
    {
        //2d direction array
        int dir[][]={
                        {1,-2},
                        {2,-1},
                        {2,1},
                        {1,2},
                        {-1,2},
                        {-2,1},
                        {-2,-1},
                        {-1,-2}
                    };
        
           
                        
        for(int di=0;di<dir.length;di++)
        {
            
                //eqrow=enemyqueenrow
                int KEnemyrow=row+dir[di][1];

                //eqcol=enemyqueencol
                int KnightEnemycol=col+dir[di][0];

                if(KEnemyrow<0 ||KnightEnemycol<0 || KEnemyrow>=chess.length||KnightEnemycol>=chess[0].length)
                {
                    continue;
                 
                }

                if(chess[KEnemyrow][KnightEnemycol]==true)
                {
                    return false;
                }
                                                    
            }
        
        return true;
    }

}