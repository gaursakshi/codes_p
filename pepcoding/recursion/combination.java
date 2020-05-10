public class combination
{
     public static void main(String[] args)
    {
        boolean boxes[] = new boolean[4];
        int total_queen = 2;
        int qpsf = 0;
        String ans = "";

        combination(boxes,total_queen,qpsf,ans,-1);
        
    }
    static int count=0;

    public static void combination(boolean []boxes,int tq,int qpsf,String ans,int qpwb)
    {
        if (tq == qpsf) {
            count++;
            System.out.print(count);
            System.out.println(ans);
            return;

        }


        for(int b=qpwb+1;b<boxes.length;b++)
        {
            if(boxes[b]==false)
            {
                boxes[b]=true;
                combination(boxes,tq,qpsf+1,ans + " q " + (qpsf + 1) + " b " + b,b);
                boxes[b]=false;

            }
        
        }
    }
}