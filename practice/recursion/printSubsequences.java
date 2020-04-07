import java.util.ArrayList;

class printSubsequences
{
    public static void main(String args[])
    {
        String str="abc";

       // ArrayList<String>res=printsub(str);
        //display(res);
        //System.out.println(res);
        String ans="";
        //printSubsequ(str,ans);
        int result=countSub(str);
        System.out.println(result);

    }


    public static void display(ArrayList<String>res)
    {
        for(String s:res)
        {
            System.out.println(s);
        }
    }


    public static ArrayList<String>printsub(String str)
    {

        //base case


        if(str.length()==0)
        {
            ArrayList<String>base=new ArrayList<String>();
            base.add("");
            return base;
        }


        //obtain first character
        char ch=str.charAt(0);

        //substr function
        String sub=str.substring(1);

        //faith calling

        ArrayList<String>abc=printsub(sub);

        //final result
        ArrayList<String>result=new  ArrayList<String>();

        for( String ab:abc)
        {
            
            
            result.add(ab+ch);
            result.add(ab);
        }

        return result;

    }


    //void type


    public static  void printSubsequ(String str,String ans)
    {

        //base case
        //from base it will got to second printSubsequnces 
        if(str.length()==0)
        {
            System.out.print(ans +" ");
            return ;
        }

        //faith

        char ch=str.charAt(0);
        printSubsequ(str.substring(1), ch+ans);
        printSubsequ(str.substring(1), ans);


    }

    //print number of subsequnces

     
    public static int countSub(String str)
    {
      int count=0;

        if(str.length()==0)
        {
            return 1;
        }


        //
        char ch=str.charAt(0);

        count+=countSub(str.substring(1));
        count+=countSub(str.substring(1));

        return count;

    }
}