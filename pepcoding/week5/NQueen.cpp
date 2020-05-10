#include<iostream>
#include<vector>
using namespace std;

int NQueenCombination(int no_of_box,int indx,int qpsf,int totalqueen,string ans)
{
    if(qpsf==totalqueen)
    {
        cout<<ans<<endl;
        return 1;
    }
    int count=0;

    for(int i=indx;i<no_of_box;i++)
    {
       count += NQueenCombination(no_of_box, i + 1, qpsf + 1, totalqueen, ans + "b" + to_string(i) + "q" + to_string(qpsf));
    }
    return count;
}


int NQueenPermumtation(vector<bool> &vis, int qpsf, int totalqueen, string ans)
{
    if(qpsf==totalqueen)
    {
        cout<<ans<<endl;
        return 1;
    }
    int count=0;

    for(int i=0;i<vis.size();i++)
    {
        if(!vis[i])
        {
            vis[i]=true;
            count += NQueenPermumtation( vis, qpsf + 1, totalqueen, ans + "b" + to_string(i) + "q" + to_string(qpsf));
            vis[i]=false;
        }
    }
    return count;
}


//converting 2d into one d

int queen2Dcombination(vector<vector<bool>>&board,int lpql,int qpsf,int tnq,string ans)
{
    //base case
    if(tnq==qpsf)
    {
        cout<<ans<<endl;
        return 1;
    }

    int count=0;
    for(int i=lpql;i<board.size()*board[0].size();i++)
    {
        //x represent rows
        int x=i/board[0].size();
        //y represent col
        int y=i/board[0].size();

        count+=queen2Dcombination(board,i+1,qpsf+1,tnq,ans+"("+to_string(x)+ ","+to_string(y)+")");
    }
    return count;
}


int queen2DPermutation(vector<vector<bool>>&board,int qpsf,int tnq,string ans)
{
    //base case
    if(tnq==qpsf)
    {
        cout<<ans<<endl;
        return 1;
    }

    int count=0;
    for(int i=0;i<board.size()*board[0].size();i++)
    {
        //x represent rows
        int x=i/board[0].size();
        //y represent col
        int y=i/board[0].size();

        if(!board[x][y])
        {
            board[x][y]=true;

            count+=queen2DPermutation(board,qpsf+1,tnq,ans+"("+to_string(x)+ ","+to_string(y)+")");
            board[x][y]=false;
        }

    }
    return count;
}


bool isSafeToPlaceQueen(vector<vector<bool>> &boxes, int x, int y)
{
    int xdir[4] = {0, -1, -1, -1};
    int ydir[4] = {-1, -1, 0, 1};

    for (int rad = 1; rad < max(boxes.size(), boxes[0].size()); rad++)
    {
        for (int d = 0; d < 4; d++)
        {
            int r = x + rad * xdir[d];
            int c = y + rad * ydir[d];
            if (r >= 0 && c >= 0 && r < boxes.size() && c < boxes[0].size() && boxes[r][c])
                return false;
        }
    }
    
    return true;
}
int nQueen(int tnq, vector<vector<bool>> &boxes, int lqpsf, string ans)
{
    if (tnq == 0)
    {
        cout << ans << endl;
        return 1;
    }

    int count = 0;
    for (int i = lqpsf; i < boxes.size() * boxes[0].size(); i++)
    {
        int x = i / boxes[0].size();
        int y = i % boxes[0].size();
        if (isSafeToPlaceQueen(boxes, x, y))
        {
            boxes[x][y] = true;
            count += nQueen(tnq - 1, boxes, i + 1,
                            ans + "(" + to_string(x) + ", " +
                                to_string(y) + ") ");
            boxes[x][y] = false;
        }
    }
    return count;
}

















void basicQues()
{
     //cout <<  NQueenCombination(16, 0, 0, 4, "") << endl;
      //vector<bool> vis(5,false);
       //cout<<NQueenPermumtation(vis,0,3,"")<<endl;
       vector<vector<bool>>board(4,vector<bool>(4,0));

      // cout<<queen2Dcombination(board,0,0,4,"")<<endl;

       cout<<queen2DPermutation(board,0,4,"")<<endl;
      


}
void solve()
{
    basicQues();

}
int main()
{
   solve();
}