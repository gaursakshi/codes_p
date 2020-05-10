//fiboacci series
import java.util.Scanner;

class  fibo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  n fibonacci terms");
        int n=sc.nextInt();
        

        int firstterm=0;
        int secondterm=1;
        System.out.println(firstterm);
         System.out.println(" ");
         System.out.println(secondterm);
          System.out.println(" ");
     
        
       while(n--)
       {
           
        int nextterm=firstterm+secondterm;
        System.out.println(nextterm);
        System.out.println(" ");
           
       }
       

    }

}