import java.util.Stack; 
import java.lang.String;
public class DuplicateBalancedBrackets
{
    public static void main(String[] args)
    {
       
        String str = "((a+b)+(c+d))";
        String str1="(((a+(b))+(c+d)))";


        solve(str);
        solve(str1);
    }


    public static void solve(String input)
    {
        Stack<Character>st=new Stack<Character>();
        char[] str = input.toCharArray();
        int n=str.length; 

        for(int i=0;i<n;i++)
        {
            int count=0;
       
            if(str[i]==')')
            {
                char top=st.peek();
                st.pop();

                while(top!='(')
                {
                    count++;
                    top=st.peek();
                    st.pop();

                }

                if(count<1)
                {
                    System.out.println("duplicate found");
                    return ;
               }

            }


            else
            {
                st.push(str[i]);

            }

        }
        System.out.println(" No duplicate found");
    }




    }
