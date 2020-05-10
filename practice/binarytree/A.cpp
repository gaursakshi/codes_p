


#include <bits/stdc++.h> 
using namespace std; 




int solve(int arr[])
{
    int n = sizeof(arr) / sizeof(arr[0]); 

    int max=-1;
    
    for(int i=0;i<n;i++)
    {
        int j=i+1;

        if(arr[i]>arr[j])
        {
            if(max<abs(arr[i]-arr[j]))
            {
                max=abs(arr[i]-arr[j]);
            }
            swap(arr[i],arr[j]);
            
        }
        j++;

        

    }
    return max;

}
int main()
{


    int ar[]={1,6,2,4,3,4};
    cout<<solve(ar);
}