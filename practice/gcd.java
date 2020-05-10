//to get gcd
import java.util.Scanner;

class gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number for input");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int rem=n2%n1;

        while(rem!=0)
        {
            n2=n1;
        
            n1=rem;

            rem=n2%n1;
        }

        System.out.println("the gcd is"+n1);



        
    }

}