#include<iostream>
#include<vector>
using namespace std;

vector<int> reverse1(vector<int> &arr,int start,int end)
{
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
return arr;
}

int main()
{
	
    int r;
    cin>>r;
    int n;
    cin>>n;
    vector <int>arr(n,0);

    
    for(int i=0;i<arr.size();i++)
    {
        cin>>arr[i];
    }
   
    r=r%arr.size();
    if(r<0)
    {
        r=r+arr.size();
    }

    reverse1(arr,0,r-1);
    reverse1(arr,r,arr.size()-1);
    reverse1(arr,0,arr.size()-1);

   
    for(int  i=0;i<arr.size();i++)
    {
        cout<<arr[i]<<" ";
    }

}

