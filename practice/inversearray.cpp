#include<iostream>
#include<vector>
using namespace std;
void input(vector<int>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        cin>>arr[i];
    }
}

bool check(vector<int>&arr)
{
    int flag=0;

 for(int i=0;i<arr.size();i++)
{
       int val=arr[i];
       if(arr[val]!=i)
       {
          return false; 
          

       }
       
}

    return true;
}
void invers(vector<int>&arr)
{
   
   
    for(int i=0;i<arr.size();i++)
    {
        int val=arr[i];
        arr[val]=i;
    
    }

}
int main()
{
    int n;
    cin>>n;
    vector<int>arr(n,0);

    input(arr);
    
    invers(arr);

    for(int i:arr)
    {
        cout<<i<<" ";

    }
    cout<<endl;
    cout<<boolalpha<<check(arr);


}