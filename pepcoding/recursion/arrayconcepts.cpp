#include<iostream>
#include <vector>
using namespace std;
void input(vector<int>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        cin>>arr[i];
    }
}

void display(vector<int>&arr,int virtualIndex )
{
    if(virtualIndex==arr.size())
    {
        return ;
    }

    cout<<arr[virtualIndex]<<endl;
    display(arr,virtualIndex + 1);
}


void reverse(vector<int>&arr,int virtualInd)
{
    if(virtualInd<0)
    {
        return ;
    }
    cout<<arr[virtualInd]<<endl;
    reverse(arr,virtualInd - 1);

    
}

int maximum(vector<int> &arr,int virtualInd)

{
    if(virtualInd == arr.size()-1)
    {
        return arr[virtualInd];
     
    }




    int max_faith=maximum(arr, virtualInd + 1);
    if(max_faith>arr[virtualInd])
    {
        return max_faith;
    }
    else
    {
        return arr[virtualInd];
    }

}
int main()
{
    int size;
    cin>>size;
    vector<int>arr(size,0);

    input(arr);
    cout<<"recursively displaying the array"<<endl;
    display(arr,0);
     cout<<"recursively reverse  displaying the array"<<endl;
   
    reverse(arr,size-1);


    cout<<"maximum is"<<maximum(arr,0);

}