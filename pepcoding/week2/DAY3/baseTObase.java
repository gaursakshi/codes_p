//converting from a given base into another base
import java.util.Scanner;
class baseTObase
{

    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the given number");
        int input=sc.nextInt();

        int base=sc.nextInt();
        baseToDecimal(input,base);
        


    }

   static void baseToDecimal(int n,int base)
    {
        int result=0,power=1;
         while(n!=0)
         {
            int rem=n%10;
            n=n/10;
            result+=rem*power+result;
            power=power*base;

        }
        System.out.println(result);
    }


    static void  decimalTobase(int n,int base2)

 {

}