#include <bits/stdc++.h> 
using namespace std; 


bool solve(string &str)
{
    stack<char>st;
    for(int i=0;i<str.size();i++)
    {
        if(str[i]=='[' || str[i]=='('|| str[i]=='{')
        {
            st.push(str[i]);
        }

        else
        {
        
            if(st.size()==0)
            {
                return false;

            }

            else if(str[i]==']'  && st.top()!='[')
            {
                return false;
            }


             else if(str[i]=='}'  && st.top()!='{')
            {
                return false;
            }

             else if(str[i]==')'  && st.top()!='(')
            {
                return false;
            }

            else
            {
                st.pop();
            }

        }

        
    }

    //for opening brackets
    if(st.size()>0)
    {
            return false;
    }

    else
        {
            
            return true;
        }
}





 int main()
{
    string str="[a+{b+(d+e)}]";
    cout<<solve(str);
}