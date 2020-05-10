#include<bits/stdc++.h>
using namespace std;

int printMaxNum(int num) 
{ 
    // hashed array to store count of digits 
    int count[10] = {0}; 
  
    // Converting given number to string 
    string str = to_string(num); 
  
    // Updating the count array 
    for (int i=0; i<str.length(); i++) 
        count[str[i]-'0']++; 
  
    // result is to store the final number 
    int result = 0, multiplier = 1; 
  
    // Traversing the count array 
    // to calculate the maximum number 
    for (int i = 0; i <= 9; i++) 
    { 
        while (count[i] > 0) 
        { 
            result = result + (i * multiplier); 
            count[i]--; 
            multiplier = multiplier * 10; 
        } 
    } 
  
    // return the result 
    return result; 
} 
  
int main()
{
    int n;
    cin>>n;
    if(n%3==0)
    {
    cout<<printMaxNum(n);
    }
    else
    {
        cout<<"-1";
    }
    
    

	// Write your code here
}