import java.util.*;
class fibotillgivenn
{
    public static void main(String[] args)

    {
        int a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("neter the  n th fibonacci term");
        int n=sc.nextInt();
        int counter=1;
        while(a<=n)
        {
            System.out.println(a+" " );

            c=a+b;
            a=b;
            b=c;
           
        }
       

    }
}