#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the number for  printing digits";
    cin>>n;
    while(n!=0)
    {
        int rem=n%10;
        cout<<rem<<" ";
        n=n/10;

    }
}