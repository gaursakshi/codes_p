#include<iostream>
using namespace std;

void decreasing(int n)
{
    if(n==0)
    {
        cout<<"base"<<n<<endl;

        return;
    }

    cout<<"hI"<<n<<endl;
    decreasing(n-1);
    cout<<"bye"<<n<<endl;



    
}

void increasing(int n)
{
    if(n==0)
    {
        cout<<"base"<<n<<endl;

        return;
    }

    //cout<<"hI"<<n<<endl;
    decreasing(n-1);
    cout<<"increasing"<<n<<endl;



}

void evenoddRecursion(int n)
{
   

    if(n==0)
    {
        cout<<n<<endl;
        return;
        
    }
     if((n&1)==0)
    {
        cout<<n<<endl;
    }

    

    evenoddRecursion(n-1);
  
    if(n&1!=0)
    {
        cout<<n<<endl;
    }

}
int main()
{
    int n;
    cout<<"enter the number";
    cin>>n;
    decreasing(n);
    increasing(n);
    evenoddRecursion(n);



    
}