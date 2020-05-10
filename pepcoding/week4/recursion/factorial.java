import java.util.Scanner;


public class factorial
{
    public static int factorialRecursion(int n)
    {   
        if(n==0|| n==1)
        {
           
            return 1;
        }
        return n*factorialRecursion(n-1);
    }


    public static int power(int a,int b)

{
    if(b==0)
    {
        return 1;
    }
    int ans=power(a,b-1);
    return ans*a;

}

 public static int improvedPower(int a,int b)
 {

 
    if(b==0)
    {
        return a;
    }

    int smallans=improvedPower(a,b/2);

    smallans*=smallans;
    return(b%2!=0?a*smallans:smallans);
 }


 public static int fib(int n)
 {
     if(n<=1)
     {
         return n;

       
     }
     

     return fib(n-1)+fib(n-2);
 }







    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
          System.out.print("enter the number for factorial");
        int  n=sc.nextInt();
        int result=factorialRecursion(n);
        System.out.println(result);

      

            System.out.print("enter the base");
          int  a=sc.nextInt();
            System.out.print("enter the power");
            int  b=sc.nextInt();
            int ans1=power(a,b);
             System.out.println(ans1);

             
               int result1=improvedPower(a,b);
                System.out.println(result1);


                int finalans=fib(n);
                System.out.println(finalans);


        
    }

    

}