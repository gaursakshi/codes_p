#include<iostream>
#include<string>
#include<vector>
using namespace std;



string removal(string str)
{
    //base case
    if(str.length()==0)
    {
        return  " ";

    }
    char ch=str[0];
    if(str.length()>1 && str.substr(0,2)=="hi")
    {
        return removal(str.substr(2));
    }

    else
    {
        return ch+removal(str.substr(1));

    }
 
}                                                                                                                                                                                                                                       



string removalHIT(string str)
{
    //base case
    if(str.length()==0)
    {
        return " ";

    }


    char ch=str[0];
    if(str.length()>1 && str.substr(0,2)=="hi")
    {
        
    
        if(str.length()>2 && str[2] =='t')
        {
         
             return "hit"+removalHIT(str.substr(3));
        }
    return removalHIT(str.substr(2));

    }

    else 
    {
        return removalHIT(str.substr(1));

    }
 
}


string Duplicacy(string str)
{
    if(str.length()==0)
    {
        return " ";
    }
    char ch=str[0];
    if(str.length()>0 && str[0]==str[1])
    {
        return Duplicacy(str.substr(2));
    }

    else
    {
       return ch+Duplicacy(str.substr(1));
    }
    

}


vector<string> subseq(string str)
{
    char ch;
    if(str.length()==0)
    {
        vector<string>base;
        base.push_back("");
        return base;

    }
    ch=str[0];

    vector<string>smallAns=subseq(str.substr(1));
    vector<string>myAns(smallAns); 
    for(string s:smallAns)
    {
        myAns.push_back(ch+s);
        
    }
    return myAns;

 
}
int main()
{

   string str="hihiiiihi";
    cout<<removal(str);

    //fucntion call 2

    cout<<"removal of hit in string of hi";

    string str1="hithihihithihithithit";
    cout<<removalHIT(str1)<<endl;


    string abc="aaaabccdd";
    cout<<Duplicacy(abc)<<endl;


    //
    string s="abcd";
    vector<string>result=subseq(s);

    for(int i=0;i<result.size();i++)
    {
        cout<<result[i]<<endl;
    }

}