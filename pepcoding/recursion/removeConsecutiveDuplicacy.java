public class removeConsecutiveDuplicacy
{
    public static void main(String args[])
    {
        String str="aabca";
        String ans=" ";
        removeDuplicacy(str,ans);
    }


    public static void  removeDuplicacy(String str,String ans)
    {

        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);

        if (ans.charAt(ans.length()-1)!=ch)
        {
            ans += ch;
        }
        removeDuplicacy(str.substring(1),ans);

    }
}