 import java.util.Scanner;
 class  printallprimetilln
{

    public  static boolean checkprime(int n)
    {
        int counter=2;
        while(counter*counter<=n)
        {
            if(n%counter==0)
            {
                
                return false;
            }
            counter++;
            
        } 
       return true;
    }
    

    public  static void  printprime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(checkprime(i))
            {
                System.out.print(i + " ");
            }
        }

    }
    
 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");
        int n=sc.nextInt();
        printprime(n);
    }
}

        