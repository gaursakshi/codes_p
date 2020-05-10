#include<iostream>
using namespace std;

void TOH(string source,string dest,string helper,int n)
{
    if(n==0)
    {
        return;
    }
    //first faith

    TOH(source,helper,dest,n-1);

    //move 
   
    cout<<"move "<<n <<" from  "<<source<<" to "<<dest<<endl;

    //second faith prints instruction  to move n-1 from helper to destination using source
    TOH(helper,dest,source,n-1);


}
int main() 
{
    //int no_of_discs;
    //cin>>no_of_discs;

    TOH("A","B","C",3);
}