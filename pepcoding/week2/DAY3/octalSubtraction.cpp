//octal subtraction
#include<iostream>
using namespace std;
int main()
{
int n1;
int n2;
cout<<"enter no1"<<endl;
cin>>n1;
cout<<"enter no2"<<endl;
cin>>n2;
int borrow=0,power=1,final_result=0,result=0;
bool isNeg=false;
if(n1<n2)
{
    isNeg=true;
    int temp=n1;
    n1=n2;
    n2=temp;
}
while(n1!=0 || n2!=0)

{
    int firstdigit=n1%10;
    int seconddigit=n2%10;
    int result=firstdigit-seconddigit+borrow;

    if(result<0)
    {
        borrow=-1;
        result+=8;

    }
    else
    {
        borrow=0;
    }
    n1=n1/10;
    n2=n2/10;
    final_result+=result*power;
    power=power*10;


}

if(isNeg)
{


final_result*=-1;
}
cout<<final_result;



}