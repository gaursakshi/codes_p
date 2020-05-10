#include<iostream>
#include<vector>
using namespace std;
void selectionsort(vector<int>&arr)
{
    
    int journey=0;
    while(journey<arr.size())
    {
        
        for(int i=journey;i<arr.size();i++)
        {
            if(arr[i]<arr[journey-1])
            {
                int temp=arr[i];
                arr[i]=arr[journey-1];
                arr[journey-1]=arr[i];
            }
        }

        journey++;
    }
}
int main()
{
    vector<int>arr(5,0);
   for(int i=0;i<arr.size();i++)
   {
       cin>>arr[i];
   }
    selectionsort(arr);
     for(int i=0;i<arr.size();i++)
   {
       cout<<arr[i];
   }
   

}