#include<iostream>
#include<vector>
using namespace std;

void input(vector<int>& v1)
{
    int n=v1.size();
     cout<<"enter the element in vector";
        
    for(int i=0;i<n;i++)
    {
        cin>>v1[i];
       
    }
}


void output(vector<int>& v1)
{
    int n=v1.size();
     cout<<"the element in vector";
    for(int i=0;i<n;i++)
    {
       
        cout<<v1[i]<<" ";
    }
}
int main()
    {
        int n;
        cout<<"enter the size of the vector";

        cin>>n;
        vector<int> v1(n,0);
        input(v1);
        output(v1);
    }
    //g++ arraydemo.cpp -o out
    //out

