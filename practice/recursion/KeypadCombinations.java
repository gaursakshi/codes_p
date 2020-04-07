
import java.util.ArrayList;
class KeypadCombinations
{
    public static void main(String args[])
    {
        String str="179";
        ArrayList<String>res=Keypad( str);
        System.out.println(res);


    }

    static String[]codes={".","abc","def","ghi","jkl","mno","qr","st","uvwx","yz"};
    public static ArrayList<String>Keypad(String str)
    {

        if(str.length()==0)
        {
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;

        }


        char ch=str.charAt(0);
        String second=str.substring(1);
        ArrayList<String>ab=Keypad(second);

        ArrayList<String>result=new ArrayList<String>();

        for(String ch1:ab)
        {
            String code=codes[ch-'0'];
            for(int i=0;i<code.length();i++)
            {
                char fromch=code.charAt(i);
                result.add(ch1 + fromch);
            }
        }

        return result;

    }
}