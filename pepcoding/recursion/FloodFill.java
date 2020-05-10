public class FloodFill
{
    public static void main(String args[])
    {
        int sr=0,sc=0;
        String psf="";
        int [][]mazepath={{1,0,1,1},
                        {0,0,1,1},
                        {0,0,1,1},
                        {1,1,1,1}};
        
        boolean visited[][]=new boolean[4][4];
        floodfill(sr,sc,mazepath,visited,psf);
    }
    static int counter=0;

    public static void  floodfill(int sr,int sc,int[][]mazepath,boolean visited[][],String psf)
    {
        //base case
        if(sr==mazepath.length-1 &&sc==mazepath[0].length-1)
        {
            counter++;
            System.out.print(counter+" ");
            System.out.println(psf);
            return;
        }

        //check safe conditionns

        if(issafe(sr,sc,mazepath)==true || visited[sr][sc]==true)
        {
            return;

        }
        
        visited[sr][sc]=true;

        //4 calls in 4 directions
        floodfill(sr+1,sc,mazepath,visited,psf+"D");
        floodfill(sr,sc-1,mazepath,visited,psf+"L");
        floodfill(sr-1,sc,mazepath,visited,psf+"T");
        floodfill(sr,sc+1,mazepath,visited,psf+"R");

        visited[sr][sc]=false;


    }

    public static boolean issafe(int sr,int sc,int mazepath[][])
    {
        if(sr<0 ||sc<0|| sc>mazepath[0].length-1 || sr>mazepath.length-1  ||mazepath[sr][sc]==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}