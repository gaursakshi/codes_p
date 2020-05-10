import java.util.Scanner;
class PyramidProgram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int nst=1;
        for(int i=1;i<=rows;i++)
        {
            System.out.print(" ");
            for(int cst=1;cst<=nst;cst++)
            {
                
                System.out.print("*");
                
                
            }
            
            System.out.println();
            nst++;
        }
    }
}