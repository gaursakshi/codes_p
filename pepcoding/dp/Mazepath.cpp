#include<iostream>
#include<vector>
#include<string>
using namespace std;
#define vi vector<int>
#define vvi vector<vi>

//1.Horizontal /vertical move  only one 

void display2D(vvi &dp)
{
    for (vi &ar : dp)
    {
        for (int &ele : ar)
        {
            cout << ele << " ";
        cout << endl;
        }
    }
    cout << endl;
}




int mazePathnormalRecursuion(int sr,int sc,int er,int ec,string ans)
{
    //base case
    if(sr==er && sc==ec)
    {
        cout<<ans<<endl;
        return 1;
    }
    int count=0;


    if(sr+1<=er) 
    {
        count+=mazePathnormalRecursuion(sr+1,sc,er,ec,ans+"V");
    }


     if(sc+1<=ec) 
    {
        count+=mazePathnormalRecursuion(sr,sc+1,er,ec,ans+"H");
    }
    return count;
}


//memoisation
int mazepath_memo(int sr,int sc,int er,int ec,vvi & dp)
{
    int count=0;
    //base case
     if(sr==er && sc==ec)
     {
        dp[sr][sc]=1;
        return 1; 
     }

     if(dp[sr][sc]!=0)
     {
         return dp[sr][sc];
     }

     if(sr+1<=er) 
    {
        count+=mazepath_memo(sr+1,sc,er,ec,dp);
    }


     if(sc+1<=ec) 
    {
        count+=mazepath_memo(sr,sc+1,er,ec,dp);
    }
    dp[sr][sc]=count;
    return count;



}

int mazePath(int er,int ec,vvi& dp)
{

    for(int sr=er;sr>=0;sr--)
    {
        for(int sc=ec;sc>=0;sc--)
        {
            if(sr==er && sc==ec)
            {
                dp[sr][sc]=1;
                continue;
            }


            int count=0;


            if(sr+1<=er)
            {
                count+=dp[sr+1][ec];
            }

            if(sc+1<=ec)
            {
                 count+=dp[sc+1][ec];

            }


            

            dp[sr][sc]=count;


            //mirror  image doubt
            if(er==ec){
                dp[sc][sr]=count;
            }


           




        }
    }
    return dp[0][0];
    
}







int main()
{
    int n=3;
   
  
  //vector<int>dp(n+1,0);
   vvi dp(n, vi(n, 0));
  // cout<<"total number of  path in maze path using horizontal and vertical "<< mazePathnormalRecursuion(0,0,2,2,"");
   cout<<mazepath_memo(0,0,2,2,dp)<<endl;
   display2D(dp);
}
