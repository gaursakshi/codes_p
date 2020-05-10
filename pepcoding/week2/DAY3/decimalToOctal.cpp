#include<iostream>
using namespace std;
void decimaltoOctal(int n)
  {
      int result=0,power=1;
    while(n!=0)
    {
        int rem=n%8;
        n=n/8;
        result+=rem*power+result;
        power=power*10;

    }
    cout<<"the number of conversion"<<result;
    
    }

int main()
{
    int n;
    cout<<"enter the number for conversion for decimal to Octal";
    cin>>n;

    decimaltoOctal(n);
    


}