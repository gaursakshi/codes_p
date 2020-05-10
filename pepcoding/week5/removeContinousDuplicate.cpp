
#include<iostream>
using namespace std;

string removeDuplicate(string str,int vidx)
{
    if(str.length()==vidx)
    {
        return string(1,str[vidx-1]);
    }

    if(vidx!=0 and str[vidx-1]!=str[vidx])
    {
        return str[vidx-1]+removeDuplicate(str,vidx+1);

    }
    else
    {
       return removeDuplicate(str,vidx+1);
    }
    
}
int main()
{
    cout<<removeDuplicate("aabccd",0)<<endl;
    
}