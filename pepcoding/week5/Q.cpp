#include<iostream>
#include<vector>
using namespace std;

bool isSafeToPlaceQueen(vector<vector<bool>> &boxes, int x, int y)
{
   vector<vector<int>>dir={{-1,0},{0,-1},{-1,-1},{-1,1},{0,1},{1,0},{1,1},{1,-1}};

    for (int i = 0; i< dir.size(); i++)
    {
        for (int radius = 1; radius< max(boxes.size(), boxes[0].size()); radius++)
        {
        
            int r = x + radius * dir[i][0];
            int c = y + radius * dir[i][1];

            //to check point lies  outside the box and boxes[r][c] check whether it is safe or not
            if (r <0 || c < 0 || r >= boxes.size() || c >= boxes[0].size() )
                break;
            if( boxes[r][c])
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

int nQueenUSingPerumtation(int tnq, vector<vector<bool>> &boxes, string ans)
{
    if (tnq == 0)
    {
        cout << ans << endl;
        return 1;
    }

    int count = 0;
    for (int i = 0; i < boxes.size() * boxes[0].size(); i++)
    {
        int x = i / boxes[0].size();
        int y = i % boxes[0].size();
        if (!boxes[x][y] && isSafeToPlaceQueen(boxes, x, y ) )
        {
            boxes[x][y] = true;
            count += nQueenUSingPerumtation(tnq - 1, boxes, ans + "(" + to_string(x) + ", " +to_string(y) + ") ");
            boxes[x][y] = false;
        }
    }
    return count;
}
//https://kwoc.kossiitkgp.org/end-term/gaursakshi


int main()
{
     vector<vector<bool>> boxes(4, vector<bool>(4, 0));
    cout << nQueen(4, boxes, 0, "") << endl;
     //cout << nQueenUSingPerumtation(4, boxes,  "") << endl;
    return 0;
}