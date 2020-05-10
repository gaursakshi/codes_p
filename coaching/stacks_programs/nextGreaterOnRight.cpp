#include<iostream>
#include<string>
#include<vector>
#include<stack>
using namespace std;

vector<int>solve(vector<int>&arr)
{
    stack<int>st;

    vector<int>result(arr.size(),0);

    st.push(0);

    for(int i=1;i<arr.size();i++)
    {
        while(st.size()!=0 && arr[st.top()]<arr[i])
        {
            result[st.top()]=arr[i];
            st.pop();
        }

        st.push(i);

    }

    while(st.size()>0)
    {
        result[st.top()]=-1;
        st.pop();
    }
    return result;


}
int main()
{
    int size;
    cin>>size;
    vector<int>arr;
   for(int i =0;i<size;i++)
   {
       cin>>arr[i];
   }
   vector<int>result(size,0);
    
    result=solve(arr);
    for(int i=0;i<result.size();i++)
    {
        cout<<result[i];
    }

}
