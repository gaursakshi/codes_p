import java.util.Scanner;

class LeftTriangleStarPattern
{
    public static void main(String args[])
    {
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        int nst=1;
        int nsp=rows-1;

        for(int i= 1;i<=rows;i++)
        {
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print(" ");
            }

            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print("*");
            }
            nsp--;
            nst++;
            System.out.println();
            
        
        
        }
        
        
        

 }
}

