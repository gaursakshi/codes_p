#include<iostream>
#include<vector>
using namespace std;
void input(vector<vector<int>>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr[0].size();j++)
        {
            cin>>arr[i][j];
        }
    }
}

void display(vector<vector<int>>&arr)
{
    cout<<"Inital array\n";
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr[0].size();j++)
        {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;

    }
}
void ZigZagArray(vector<vector<int>>&arr)
{
    cout<<"ZigZag Array"<<endl;
    for(int row=0;row<arr.size();row++)
    {
        if(row%2==0)  //left to right
        {
            for(int col=0;col<arr[row].size();col++)
            {
                cout<<arr[row][col]<<" ";
            }
            cout<<endl;

        }  
        else
        {
            for(int col=arr[0].size()-1;col>=0;col--)
            {
                cout<<arr[row][col]<<" ";
            }
            cout<<endl;
            
        }
        
    }
}


void zigZagColumn(vector<vector<int>>&arr)
{
    
    int col=arr.size();
    for(int col=0;col<arr.size();col++)
    {
        if(col%2==0)
        {
            for(int row=0;row<arr[0].size();row++)
            {
                cout<<arr[row][col]<<" ";
            }
            cout<<endl;
        }
        else
        {
            for(int row=arr.size()-1;row>=0;row--)
            {
                cout<<arr[row][col]<<" ";
            }
           cout<<endl;
        }
        


    }

}
int main()
{
    cout<<"enter the number of rows";
    int rows;
    cin>>rows;
    cout<<"enter columns ";
    int col;
    cin>>col;
   
    vector<vector<int>>arr(rows,vector<int>(col,0));

    input(arr);
    display(arr);
    //ZigZagArray(arr);
    zigZagColumn(arr);
}