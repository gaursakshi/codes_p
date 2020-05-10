#include<iostream>
#include<vector>
#define vi vector<int>

using namespace std;
void display(vi &dp)
{
    for (int ele : dp)
        cout << ele << " ";
    cout << endl;
}

int countFriendsPairings(int n)
{
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }

    if(n==2)
    {
        return 2;
    }


    int ans=countFriendsPairings(n-1)+(n-1)*countFriendsPairings(n-2);
    return ans;
}


/////////////////////////////////////////////memoisation
int countFriends_mem(int n,vi &dp)
{
    if(n<=1)
    {
        dp[n]=1;
        return 1;

    }


    if(dp[n]!=0)
    {
        return dp[n];
    }

    int singlePair=countFriends_mem(n-1,dp);

    int doublePair=(n-1)*countFriends_mem(n-2,dp);
    int result=singlePair+doublePair;


    dp[n]=result;
    return dp[n];
}


int countFriend_tab(int n,vi&dp)
{
    for(int i=0;i<=n;i++)
    {
        if(i<=1)
        {
            dp[i]=1;
            continue;
        }

        int single=dp[i-1];
        int doublepair=dp[i-2]*(i-1);

        dp[i]=single+doublepair;
    }
    return dp[0];
}


//using 2 pointer approach

int friendpair_2Pointer(int n)
{
    int a=1;//when n=0
    int b=1; //when n=1

    int ans=0;
    if(n<=1)
    {
        return 1;
    }

    for(int i=2;i<=n;i++)
    {
         ans=b+a*(i-1);
        a=b;
        b=ans;
    }
    return ans;
}








int main()
{
     int n=5;

    vector<int>dp(n+1,0);
   
   
   // cout<<countFriendsPairings(n);
   //cout<<countFriends_mem(n,dp)<<endl;
   //cout<<countFriend_tab(n,dp)<<endl;
cout<<friendpair_2Pointer(n);

   //display(dp);
}
