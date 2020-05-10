import java.util.*;
class susequences
{
    public static void main(String args[])
    {
        System.out.println(subsequences("aa"));
         //System.out.println(subsequencesWithAscii("ab"));

    }

    public static ArrayList<String> subsequences(String str)
    {

        if(str.length()==0)
        {
             ArrayList<String>base=new ArrayList<String>();
             base.add(" ");
             return base;

        }
        char ch=str.charAt(0);
        String res=str.substring(1);
       ArrayList<String>rr=subsequences(res);
       ArrayList<String>myresult=new ArrayList<String>();

       for(String s:rr)
       {
           myresult.add(s);
           myresult.add(ch+s);
       }
       return myresult;

    }

     public static ArrayList<String> subsequencesWithAscii(String str)
    {

        if(str.length()==0)
        {
             ArrayList<String>base=new ArrayList<String>();
             base.add(" ");
             return base;

        }
        char ch=str.charAt(0);
        String res=str.substring(1);
       ArrayList<String>rr=subsequencesWithAscii(res);
       ArrayList<String>myresult=new ArrayList<String>();
      for(String s:rr)
       {
           myresult.add(s);
           myresult.add(ch+s);
           myresult.add((int)ch + s);
       }
       return myresult;

    }
}