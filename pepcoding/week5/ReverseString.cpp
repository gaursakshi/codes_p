//SubsequncesInterviewBit
#include<iostream>
using namespace std;
void reverse(string str,int vidx)
{

    //basecase as length of string  when it is 
    if(str.length()==vidx)
    {
        return ;

    }
     cout<<str[vidx];
   reverse(str,vidx-1);
  
}
int main()
{

    string str;
    cin>>str;
    int x=str.length();
    reverse(str,x-1);
    return 0;

}
