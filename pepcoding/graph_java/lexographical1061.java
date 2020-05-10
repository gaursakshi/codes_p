import java.lang.String;
public class lexographical1061
 
{
    static int []par;

    public static void main(String args[])
    {
        String s1="leetcode";
        String s2="programs";
        String S = "sourcecode";
        String result=smallestEquivalentString( s1,  s2, S);
        System.out.println(result);
    }
    public static String smallestEquivalentString(String A, String B, String S)
    {

        int n=A.length();
        par=new int[26];

        for( int i=0;i<26;i++)
        {
            par[i]=i;
        }
        for(int i=0;i<n;i++)
        {
            char ch=A.charAt(i);
            char ch1=B.charAt(i);
            int p1=findP(ch-'a');
            int p2=findP(ch1-'a');

            par[p1]=Math.min(p1,p2);
            par[p2]=Math.min(p1,p2);
        
        }

        String result="";
        char result1[]=new char [S.length()];

        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            int par=findP(ch-'a');
            result1[i]=(char)(par+'a');
           result = new String(result1);

        }
        return result;

        //this down approach will not work

         /*String result="";
        char result1[]=new char [S.length()];

        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            int ch1=ch-'a';
             int par1=par[ch1];
             char a=(char)(par1+'a');
             result1[i]=a;
             result = new String(result1);
             

        }
        return result;*/

    }

    public static  int findP(int i)
    {
        if(par[i]==i)
        {
            return i;
        }
        int result=findP(par[i]);
        par[i]=result;
        return result;
    }
}