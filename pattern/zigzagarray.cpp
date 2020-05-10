#include<iostream>
#include<vector>
using namespace std;

vector<int> zigZag(vector<int>&input)
{
    
    for(int i=0;i<input.size()-1;i++)
    {
	

        if(i%2==0 && input[i]>input[i+1])
        {
            int temp=input[i];
            input[i]=input[i+1];
            input[i+1]=temp;
        }
        else if(i%2!=0 && input[i]<input[i+1])
        {
             int temp=input[i];
            input[i]=input[i+1];
            input[i+1]=temp;
            
            
        }
        
    }
    return input;
}
int main()
 {
       
    
     int n;
     cout<<"enter the array size"<<endl;
     cin>>n;
     vector<int>input(n);
     
     cout<<"enter the array elements"<<endl;
     for(int i=0;i<n;i++)
     {
         cin>>input[i];
     }
     
      vector<int> output = zigZag(input);
      for(int ele:input)
     {
         cout<<ele<<" ";
     }
     cout<<endl;
     
     
     
    

     
	//code
	return 0;
}
