public class mazePath
{
    public static void main(String args[])
    {
        String psf="";
        //printmazePath(0, 0, 2, 2, psf);
        //printmazePath1(0, 0, 2, 2, psf);
        //printmazePAthDiagonal(0,0,2,2,psf);
        Multimovesallowed(0,0,3,3,psf);
        

    }

    //only horizontal and vertical
    public static void printmazePath(int sr,int sc,int er,int ec,String psf)
    {

        if(sr==er && sc==ec)
        {
            System.out.println(psf);
            return ;
        }
        /*doubt
        if(sc+1>ec || sr+1>er)
        {
            return;
        }*/


        //horizontal call
        if(sc+1<=ec)
        {
            printmazePath(sr,sc+1,er,ec,psf+"H");
        }

        //vertical call

        if(sr+1<=er)

        {
            printmazePath(sr+1,sc,er,ec,psf+"V");

        }
        
    }


    public static void printmazePath1(int sr,int sc,int er,int ec,String psf)
    {

        if(sr==er && sc==ec)
        {
            System.out.println(psf);
            return ;
        }
        /*doubt
        if(sc+1>ec || sr+1>er)
        {
            return;
        }*/

        if(sr>er || er>ec)
        {
            return ;
        }


        //horizontal call
          printmazePath1(sr,sc+1,er,ec,psf+"H");
        

        //vertical call

       
            printmazePath1(sr+1,sc,er,ec,psf+"V");

        
        
    }

    static int counter=0;
   public static void printmazePAthDiagonal(int sr,int sc,int er,int ec,String psf)
   {

        if(sr==er & ec==sc)
        {
            counter++;
            System.out.println(counter);
            System.out.println(psf);
            return;
        }

        if(sr>er && sc>ec)
        {
            return;
        }

        //diagonall call
        printmazePAthDiagonal(sr+1, sc+1, er, ec, psf+"D");

        //horizontal call
        printmazePAthDiagonal(sr, sc+1, er, ec, psf+"H");

        //vertical call
        printmazePAthDiagonal(sr+1, sc, er, ec, psf+"V");

   }


   ////Multimoves are allowed

  public static  void Multimovesallowed(int sr,int sc,int er,int ec,String psf)
   {

        if(sr==er && sc==ec)
        {
            System.out.println(psf);
            return;
        }


        //ma denotes the minium ek jump ka toh lgega hi  ma -denotes amplitude
        for(int ma=1;ma<=ec-sc;ma++)
        {
            Multimovesallowed(sr, sc+ma, er, ec, psf+"H"+ma);
        }


        
        for(int ma=1;ma<=er-sr;ma++)
        {
            Multimovesallowed(sr+ma, sc, er, ec, psf+"V"+ma);
        }

        for(int ma=1;ma<=er-sr && ma<=ec-sc;ma++)
        {
            Multimovesallowed(sr+ma, sc+ma, er, ec, psf+"D"+ma);
        }


   }


}