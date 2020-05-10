#include<iostream>
using namespace std;

void decimalToanyBase(int decimal,int base)

{
    int rem=0;
    int power=1;
    int result;
    while(decimal!=0)
    {
         rem=decimal%base;
        decimal=decimal/base;
         result=rem*power+result;
        power=power*10;

    }
    cout<< result;
}
 int main()
 {
     int decimal;
     cout<<"enter the decimal number";
     cin>>decimal;
     int base;
     cout<<"enter the base";
     cin>>base;
    decimalToanyBase(decimal,base);
     
 }