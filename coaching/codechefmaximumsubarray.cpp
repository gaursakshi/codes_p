#include <bits/stdc++.h>
#include<vector>
using namespace std;

int maxsubarraysum(vector<int>&arr)
{
    int sum=0;
    int globalsum=INT_MIN;
    for(int i=0;i<arr.size();i++)
    {
            sum+=arr[i];
        
            if(sum>globalsum)
            {
                globalsum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
      
    }
    return globalsum;
}


int main()
{
    int t;
    cin>>t;
    while(t>0)
    {
        int n;
        cin>>n;
        vector<int>arr(n,0);
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        
         int result=maxsubarraysum(arr);
         cout<<result<<"\t";
        
         int change=n-1;
         while(change>0)
         {
              int r=1;
std::rotate(arr.begin(),arr.begin()+r,arr.end());
            
            // reverse(arr,1,arr.size()-1);
             //reverse(arr,0,arr.size()-1);
             result=maxsubarraysum(arr);
             cout<<result<<"\t";
             change--;
             
         }
         
        
        
        t--;
    }

	return 0;
}
