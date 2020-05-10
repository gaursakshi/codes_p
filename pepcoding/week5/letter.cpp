#include<iostream>
#include<vector>
using namespace std;

vector<string>encoding(string str)
{
    //base case
    if(str.length()==0)
    {
        vector<string>base;
        base.push_back("");
        return base;
    }

    vector<string>myans;

    char ch=str[0];

    //to avoid calling of )
    if(ch=='0')
    {
        return encoding(str.substr(1));
    }

    //now calling the function for ch=1 to ch=9
    char ch_=(char)(ch-'1'+'a');
    vector<string>firstresult=encoding(str.substr(1));
    for(string s:firstresult)
    {
        myans.push_back(ch_+s);
    }

    if(str.length()>1)
    {
        int num=(ch-'0')*10+(str[1]-'0');
      
        if(num<=26)
        {
            char ch_=(char)(num+'a'-1);
            vector<string>secondresult=encoding(str.substr(2));
            for(string s:secondresult)
            {
                myans.push_back(ch_+s);
            }

        }
    }
    return myans;

}

int main()
{
    vector<string>finalresult=encoding("41007");

    for(string str:finalresult)
    {
        cout<<str<<endl;
    }
}