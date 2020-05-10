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


void output(vector<vector<int>>&arr)
{
    cout<<"the matrix for display is\n";
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr[0].size();j++)
        {
            cout<<arr[i][j]<<" ";
        }
    }
}


void zigZag(vector<vector<int>>&arr)
{   
    cout<<"printing array zigZag is"<<endl;
    
       for(int rows=0;rows<arr.size();rows++)
        {
            if(rows%2==0)
            {
                for(int col=0;col<=arr[0].size()-1;col++)
                {

                
                cout<<arr[rows][col]<<" ";
               
                }
            }  


            //for odd index 
            else
            {
                for(int col=arr[0].size()-1;col>=0;col--)
                {
                    cout<<arr[rows][col]<<" ";

                }
                
            }
            cout<<endl;
        }
        
    }

    

void exitPoint(vector<vector<int>>&arr)
{
    cout<<"printing the exit point of the array"<<endl;
    int dir=0;int rows=0,col=0;

    while(true)
    {
        dir=dir+arr[rows][col]%4;

        if(dir==0)
        {
            col++;

            if(col==arr.size())
            {
                cout<<col-1<<" "<<rows<<endl;
            }
        }

        else if(dir==1)
        {
            rows++;
            if(rows==arr.size())
            {
                cout<<rows-1<<" "<<col<<endl;
            }


        }

        else if(dir==2)
        {
            col--;
            if(col==-1)
            {
                cout<<rows<<" "<<col-1<<endl;
            }
        }

        else
        {
            rows--;
            if(rows==-1)
            {
                cout<<rows+1<<" "<<col<<endl;
            }

           
        }
        
    }



}

void swapV(vector<vector<int>>&arr)
{
    int c1=0;
    int c2=arr[0].size()-1;
    while(c1<c2)
    {

        for(int row=0;row<arr[0].size();row++)
    {
        for(int j=0;j<)
        swap(arr[])
    }
        c2++;
        c1++;

    }
}
void swapH(vector<vector<int>>&arr)
{
    int r1=0;
    int r2=arr[0].size()-1;
    while(r1<r2)

    {
        swap(arr[r1],arr[r2]);
        r1++;
        r2--;

    }
}

void transpose(vector<vector<int>>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;i<arr[0].size();j++)
        {
            swap(arr[i][j],arr[j][i]);
        }
    }
}
void rotate90(vector<vector<int>>&arr)
{
    transpose(arr);
    if(clockWise)

        swapC(arr);
        else
        
            swapR(arr);
            /* code */
        
        


}

}


void spiral(vector<vector<int>>&arr)
{
    int total_no_elements=arr.size()*arr[0].size();
    int minrow=0;
    int maxcol=arr[0].size()-1;
    int mincol=0;
    int maxrow=arr[0].size()-1;

    cout<<"\nsprial print of array\n";

    while(total_no_elements!=0)
    {

        for(int i=minrow;i<=maxcol && total_no_elements!=0;i++)
        {
            cout<<arr[minrow][i];
            total_no_elements--;

        }

        minrow++;


        for(int i=minrow;i<=maxrow && total_no_elements!=0;i++)
        {
            cout<<arr[i][maxcol];
            total_no_elements--;

        }
        maxcol--;

        for(int i=maxcol;i>=mincol && total_no_elements!=0;i--)
        {
            cout<<arr[i][maxcol];
            total_no_elements--;

        }
        maxrow--;


        for(int i=maxrow;i>=minrow && total_no_elements!=0;i++)
        {
            cout<<arr[i][mincol];
            total_no_elements--;

        }
        mincol++;










    }



}



int main(int args,char **argv)
{
    int rows;
    int col;
    cout<<"enter the rows\n";
    cin>>rows;
    cout<<"enter the co\n";
    cin>>col;


    vector<vector<int>>arr(rows,vector<int>(col,0));

    input(arr);

    output(arr);
    zigZag(arr);
    //exitPoint(arr);
    spiral(arr);





}