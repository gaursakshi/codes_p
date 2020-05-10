#include<iostream>
#include<vector>
using namespace std;

#define vi vector<int>
#define vvi vector<vi>

int fibo_normal(int n)
{

    if(n<=1)
    {
        return n;
    }

    int ans=fibo_normal(n-1)+fibo_normal(n-2);
    return ans;
    
}

int fibo_memoisation(int n,vi  &dp)

{
    if(n<=1)
    {
        return dp[n]=n;

    }


    if(dp[n]!=0)
    {
        return dp[n];
    }

    int ans=fibo_memoisation(n-1,dp)+fibo_memoisation(n-2,dp);

    //storing of answer on off 
    dp[n]=ans;

    return ans;
}


int fibo_tabulation(int n,vi & dp)
{
    for(int i=0;i<=n;i++)
    
    {
        if(i<=1)
        {
            dp[i]=i;
            continue;
        }
        dp[i]=dp[i-1]+dp[i-2];

    }
    return dp[n];
}


 
int main()
{
    int n=6;
    //int result=fibo_normal(n);
    //cout<<"normal fibo "<<result;

    vi dp(n+1,0);
    int result=fibo_memoisation(n,dp);
    cout<<"fibo memoisation "<<result;


    //int result=fibo_tabulation(n,dp);
    //cout<<"fibo tabulation "<<result;

  
    return 0;
}