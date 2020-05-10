#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void bubbleSort(vector<int>&arr,int start,int last)
{
    
    if(last==0)
    {
        return;
    }
    if(start==last)
    {
        bubbleSort(arr,0,last--);
        return ;
        
    }
    if(arr[start]>arr[start + 1])
    {
        int temp=arr[start];
        arr[start]=arr[start + 1];
        arr[start + 1]=temp;
    }
    bubbleSort(arr,start+1,last);
    
}
void display(vector<int>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        cout<<arr[i]<<" ";
    }}


int main() 
{
    int n;cin>>n;
    
    
    vector<int>arr(n,0);
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    bubbleSort(arr,0,arr.size()-1);
    display(arr);
   

    return 0;
}
    
