//print Decreasing 
#include<iostream>
using namespace std;
void printDecreasing(int n)
{
    if(n==0)
    {
        return ;
    }
    cout<<n<<endl;
    printDecreasing(n-1);
}

void printIncreasing(int n)
{
    if(n==0)
    {
        return ;
    }
    printIncreasing(n-1);
    cout<<n<<endl;
}

  void printIncreasingDecreasing(int n)
  {
      if(n==0)
      {
          return;
      }
      cout<<n<<endl;
        printIncreasingDecreasing(n-1);
        cout<<n<<endl;
  }

  int factorial(int n)
  {
      if(n==0)
      {
          return 1;
      }
      int factnminus1=factorial(n-1);
      int fn=n*factnminus1;
      return fn;
  }

  int power(int x,int n)
  {
      //base case depend upon the varing variable
      if(n==0)
      {
          return 1;

      }
      int xpowerminus1=power(x,n-1);//faith
      int xpowern=xpowerminus1*x;
      return xpowern;
  }


  void printOddEven(int n)
  {
      if(n==0)
      {
          cout<<n<<endl;
          return ;
      }
     if(n%2==0)
     {
         cout<<n<<endl;
     }
      printOddEven(n-1);

      if(n%2!=0)
      {
          cout<<n<<endl;
      }
  }

  int improvedPower(int x,int n)
  {
      if(n==1)
      {
          return x;
      }

      int smallans=power(x,n/2);
      smallans*=smallans;
      return (n%2!=0)?smallans*x:smallans;



  }
int main()
{
    //int n;
   // cin>>n;
    //printDecreasing( n);
    //printIncreasing(n);
    //printIncreasingDecreasing(n);
    //int result=factorial(n);
    //cout<<result;
    //cout<<power(5,4);
    //printOddEven(n);
    cout<<improvedPower(5,4);
   


}