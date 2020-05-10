import java.util.Scanner;
class RightTriangleStarPattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int nst=1;
        int nsp=0;
        for(int i=1;i<=rows;i++)
        {
            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print("*");
            }

            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print(" ");
            }
            System.out.println();
            nst++;

        }
    }
}