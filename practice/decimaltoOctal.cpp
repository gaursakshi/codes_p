#include<iostream>
using namespace std;

void decimaltoOctal(int decimal)
{
    int rem=0;
    int power=1; //10^0
    int octal;

    while(decimal!=0)
    {
        rem=decimal%8;
        decimal=decimal/8;
        octal+=rem*power;
      power=power*10;
    

    }
    cout<<"the octal  number is " <<octal<<endl;

}
int main()
{
    int decimal;
    cout<<"enter the decimal number";
    cin>>decimal;
    decimaltoOctal(decimal);

    
}