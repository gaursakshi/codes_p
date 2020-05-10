#include<iostream>
using namespace std;

void calculateusingLoop(int n)
{
    int count=0;
    for(int i=0;i<32;i++)
    {
        int mask=(1<<i);
        if((n & mask)!=0)
        {
            count++;

        }
    }

    cout<<count;
}

void calculateOptimised(int n)

{
    int count=0;
    while(n!=0)
    {
        if((n&1)!=0)
        {
            count++;
        }
        n>>=1;
    }

}

    int  main()
{
    int n;
    cin>>n;
    calculateusingLoop(n);

    calculateOptimised(n);




}