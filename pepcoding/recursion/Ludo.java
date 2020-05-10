import java.nio.file.Path;

public class Ludo
{
    public static void main(String args[])
    {
        int src=0;
        int  dest=10;
        String path_so_far="";
        int []ladders=new int[16];
        ladders[2]=13;
        ladders[3]=11;
        ladders[5]=7;
        //printwithLadders(src, dest, ladders, path_so_far);
        
        //pathPrint(src,dest,path_so_far);
        //pathPrint(src, dest, path_so_far);
        //printPathwith16opening(src, dest, path_so_far);

        int snl[]= new int[21];
        snl[19]=2;
        snl[3]=17;
        snl[13]=5;
        snl[11]=7;

        //int []moves={2,5,3,4,6,3,4,3,5,1,1,6,5,2,3};
        int []moves1={2,5,3,4,6,3,4,3,5,1,2,3};

        PathWithSnakesAndLadders(src, dest, snl, moves1, 0);
    }
    

    public static void pathPrint(int src,int dest,String path_so_far)
    {
        //base case
        if(src==dest)
        {
            System.out.println(path_so_far);
            //System.out.println(count);
            return;
        }
        

        //reactive base case

        if(src>dest)
        {
            return ;
        }

        for(int dice=1;dice<=6;dice++)
        {
            int intermediate=src+dice;
            //calling of our faith
           
           pathPrint(intermediate, dest, path_so_far+dice);




        }

    }


    public static void printPathwith16opening(int src,int dest,String path_so_far)
    {

        if(src==dest)
        {
            System.out.println(path_so_far);
            return;
        }
        if(src>dest)
        {
            return;
        }
        if(src==0)
        {
            printPathwith16opening(src+1, dest, path_so_far+1);
            printPathwith16opening(src+1, dest, path_so_far+6);

        }
        else
        {
            for(int dice=1;dice<=6;dice++)
            {

                //faith
                int intermediate=src+dice;
                printPathwith16opening(intermediate, dest, path_so_far+dice);
            }
        }
    }

    public static void  printwithLadders(int src,int dest,int []ladders,String  path_so_far)
    {


        if(src==0)
        {
            printwithLadders(1, dest, ladders, path_so_far+1);
            printwithLadders(1, dest, ladders, path_so_far+6);
        }
        else if(ladders[src]!=0)
        {
            printwithLadders(ladders[src], dest, ladders, path_so_far+"["+src +"->"+ladders[src]+"]");
        }



        else
        {
            for(int dice=0;dice<=6;dice++)
            {
                int intermediate=src+dice;
                //faith
                printwithLadders(intermediate, dest, ladders, path_so_far+dice);
            }

        }

    }

    public static void PathWithSnakesAndLadders(int src,int dest,int snl[],int []moves,int mivdix)
    {
        if(src==dest)
        {
            System.out.println("win");
            return ;
        }

        //if moves are over
        if(mivdix==moves.length)
        {
            //loses
            System.out.println(src);
            return ;

        }
        if(src==0)
        {
            if(moves[mivdix]==0 || moves[mivdix]==6)
            {
                    //isme path wali chiz print nhi krni thi isliye 6 wali clall nhi lgayi
                    PathWithSnakesAndLadders(1, dest, snl, moves, mivdix+1);
            }
            else
            {
                //agr 0 ya 6 nhi aaya toh meri chance miss hogyi ..src pr the src pr hi reh jayenge pr changes increase ho jayegi
            
                PathWithSnakesAndLadders(src, dest, snl, moves, mivdix+1);
            }

        }

        else
        {
            //check kro ki snake ya ladder h agr h toh mivdx nho badegi kyunki hum pehle wha pauchenge
            if(snl[src]!=0)
            {
                PathWithSnakesAndLadders(snl[src], dest, snl, moves, mivdix);

            }
            else
            {
                if( src+moves[mivdix]<=dest)
                {
                    PathWithSnakesAndLadders(src+moves[mivdix], dest, snl, moves, mivdix+1);

                }
                else
                {
                    PathWithSnakesAndLadders(src, dest, snl, moves, mivdix+1);

                }

            }
        }
       
    
    }


}