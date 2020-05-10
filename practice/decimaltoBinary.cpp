#include<iostream>
using namespace std;

void decimalTobinary(int decimalno)
{
    int binary=0;
    int power=1; //10^0;

    while(decimalno!=0)
    {
        int rem=decimalno%2;
        decimalno=decimalno/2;
         binary+=rem*power;
        power=power*10;

    }

    cout<<"the binary number  generated is "<<binary<<endl;

}

void binaryTodecimal(int binary_no)
{
    int decimal=0;
    int power=1;   //2^0;

    while(binary_no!=0)
    {
        int rem=binary_no%10;
        binary_no=binary_no/10;
        decimal += rem*power;
        power=power*2;

    }

    cout<<"the decimal number genrated is "<<decimal;

}
int main()
{
    int binaryno;
    int decimalno;
    cout<<"enter the decimal number";
    cin>>decimalno;
    decimalTobinary(decimalno);

//conversion for binary to decimal
    cout<<"enter the binary number";
    cin>>binaryno;
    binaryTodecimal(binaryno);



}