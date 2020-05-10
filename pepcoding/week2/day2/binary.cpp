//binary representation
#include<iostream>
#include<vector>
using namespace std;
 int result=0,power=1;

 void binarytodecimal(int n);
 
 void binarytodecimal(int n)
  {
      
    while(n!=0)
    {
        int rem=n%10;
        n=n/10;
        result+=rem*power+result;
        power=power*2;

    }
    cout<<result;
    
    }
void decimaltobinary(int n)
  {
    while(n!=0)
    {
        int rem=n%2;
        n=n/2;
        result+=rem*power+result;
        power=power*10;

    }
    binarytodecimal(result);
    }



int main()
{
    int n;
    cin>>n;
   
    decimaltobinary(n);
    
  






}