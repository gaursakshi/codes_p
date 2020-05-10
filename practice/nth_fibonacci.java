import java.util.*;
class nthfibonacci
{
    public static void main(String[] args)

    {
        int a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        System.out.println("the nth fibonacci is "+b);

    }
}