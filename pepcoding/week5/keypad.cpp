#include<iostream>
#include<vector>
using namespace std;
vector<string> words={"_","+-/","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","*%()","#@$"};
vector<string>keypad(string str)
{
    if(str.length()==0)
    {
        vector<string>base;
        base.push_back("");
        return base;
    }

    vector<string>myans;
    char ch=str[0];

    string word1=words[ch-'0'];

    vector<string>onechar=keypad(str.substr(1));
    for(string s:onechar)
    {
        for(int i=0;i<word1.length();i++)
        {
            myans.push_back(word1[i]+s);
        }
    }
    
    if(str.length()>1 && ch!='0')
    {
        int number=((ch-'0')*10+str[1]-'0');
        if(number<12)
        {
            string word2=words[number];
             vector<string>secondresult=keypad(str.substr(2));
            for(string s:secondresult)
            {
            for(int i=0;i<word2.length();i++)
            {
                myans.push_back(word2[i]+s);
            }
            }
        }
        
    }
   
    return myans;

}

int main()
{
vector<string>result= keypad("10811");
for(string s:result)
{
    cout<<s<<endl;
}

}