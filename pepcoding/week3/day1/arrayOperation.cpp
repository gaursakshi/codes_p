#include<iostream>
#include<vector>
using namespace std;
bool find_element(vector<int>& arr,int x)
{
    for(int i=0;i<=arr.size()-1;i++)
    {
        if(arr[i]==x)
        {
            return true;
            break;
        }
    }
    return false;
}

int max_element(vector<int>&arr)
{
    int max=arr[0];
    for(int i=1;i<=arr.size()-1;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];

        }
    }
    return max;
    
}


int min_element(vector<int>&arr)
{
    int min=arr[0];
    for(int i=0;i<=arr.size()-1;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];

        }
    }
    return min;
    
}
int main()
{
    int n;
    cout<<"enter the size of the array\n";
    cin>>n;
    vector <int>arr(n,0);

    
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];\
    }

    int required;
    cout<<"enter the element you want to find\n";
    cin>>required;


    int x=find_element(arr,required);
    if(x==1)
    {
        cout<<"found";
    }
    else
    {
        cout<<"not found";
    }

    int maximum=max_element(arr);
    cout<<"\nmaximum element is "<<maximum;

    int minimum=min_element(arr);
    cout<<"\nmimnimum element is "<<minimum;



    




}