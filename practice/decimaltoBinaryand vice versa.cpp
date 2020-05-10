#include<iostream>
using namespace std;

void decimalTobinary(int decimalno)
{
    int rem=0,binary=0;
    int power=1; //10^0;

    while(decimalno!=0)
    {
        int rem=decimalno%2;
        decimalno=decimalno/2;
         binary=rem*power;
        power=power*10;

    }

    cout<<"the binary number  generated is"<<binary;

}
int main()
{
    int decimalno;
    cout<<"enter the decimal number";
    cin>>decimalno
    decimalTobinary(decimalno);

}