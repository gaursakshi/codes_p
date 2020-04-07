class printASciiSubsequences
{
    public static void main(String args[])
    {
        String str="abc";
        String ans="";

        printASciiSubsequences(str,ans);

    }

    public static void printASciiSubsequences(String str,String ans)
    {


        if(str.length()==0)
        {
            System.out.println(ans);
            return ;
        }

        char ch=str.charAt(0);

        printASciiSubsequences(str.substring(1), ch+ans);
        printASciiSubsequences(str.substring(1), ans);
        printASciiSubsequences(str.substring(1),(int)ch+ans);
       
       

    }
}