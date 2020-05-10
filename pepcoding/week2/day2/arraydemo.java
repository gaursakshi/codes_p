import java.util.Scanner;





class arraydemo
{
    public static void main(String args[])
    {
        System.out.println("enter the size of array");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int []arr=new int[n];
        input(arr);
        output(arr);

    }        
static void input(int[]arr)
{
    for(int i=0;i<arr.length;i++)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        arr[i]=x;

        
    }

}

static void output(int []arr)
{
    System.out.println("the output of array");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
        System.out.println();
    }
}



    }