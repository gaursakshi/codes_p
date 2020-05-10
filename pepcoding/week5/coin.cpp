#include<iostream>
#include<string>
#include<vector>
using namespace std;


//creating permumation for coins using inifinte coins

int permuInfi(vector<int> &arr, int tar, string ans)
{
    if (tar == 0)
    {
        cout << ans << endl;
        return 1;
    }
    int count = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        if (tar - arr[i] >= 0)
            count += permuInfi(arr, tar - arr[i], ans + to_string(arr[i]) + " ");
    }
    return count;
}




int combiInfi(vector<int> &arr, int idx, int tar, string ans)
{
    if (tar == 0)
    {
        cout << ans << endl;
        return 1;
    }
    int count = 0;
    for (int i = idx; i < arr.size(); i++)
    {
        if (tar - arr[i] >= 0)
            count += combiInfi(arr, i, tar - arr[i], ans + to_string(arr[i]) + " ");
    }
    return count;
}


int combiWithoutRepe(vector<int> &arr, int idx, int tar, string ans)
{
    if (tar == 0)
    {
        cout << ans << endl;
        return 1;
    }
    int count = 0;

    for (int i = idx; i < arr.size(); i++)
    {
        if (tar - arr[i] >= 0)
            count += combiWithoutRepe(arr, i + 1, tar - arr[i], ans + to_string(arr[i]) + " ");
    }
    return count;
}

int permuWithoutRepe(vector<int> &arr, vector<bool> &vis, int tar, string ans)
{
    if (tar == 0)
    {
        cout << ans << endl;
        return 1;
    }
    int count = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        if (!vis[i] && tar - arr[i] >= 0)
        {
            vis[i] = true;
            count += permuWithoutRepe(arr, vis, tar - arr[i], ans + to_string(arr[i]) + " ");
            vis[i] = false;
        }
    }
    return count;
}



void basicQues()
{
    
     vector<int> arr{2, 3, 5, 7};
       cout << permuInfi(arr, 10, "") << endl;
   
     cout<<combiInfi(arr,0,10,"")<<endl;

     //cout<<combiusngSinglecoin(arr,0,10,"")<<endl;
    cout << combiWithoutRepe(arr, 0, 10, "") << endl;

    vector<bool>vis(arr.size(),false);

   cout << permuWithoutRepe(arr, vis, 10, "") << endl;



}
void solve()
{
    basicQues();
}
int main()
{
    solve();
}