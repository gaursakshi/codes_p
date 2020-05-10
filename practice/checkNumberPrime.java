import java.util.Scanner;
class  checkNumberPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");
        int n=sc.nextInt();

        int counter=2;
        while(counter*counter<=n)
        {
            if(n%counter==0)
            {
                System.out.println("It is not prime");
                return;
            }
            counter++;
            
        } 
        System.out.println("it is prime" );
    }
}