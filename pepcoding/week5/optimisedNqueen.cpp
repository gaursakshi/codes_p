#include<iostream>
using namespace std;
#define vector<int>vi;
#define vector<vi>vii;
int Nqueen(,intn,int row,int tnq,int col,int diag,int adiag,String ans)
{
    if(row==board.size()|| tnq==0)
    {
        if(tnq==0)
        {
            cout<<ans<<endl;
        }
        return 1;

    }



    vector<int>col(4,0);
    for(int col=0;col<n;col++)
    {
        int w=l<<c;
        int x=l<<(r+c);
        int y=l<<(r-c+h-1);
        if(!col &w)&&(!diag & x)&&(!diag&y))
        {
            col^=w;
            diag^=x;
            adiag^=y;
            count+=Nqueen(n,r+1,tnq-1,col,diag,adiag,ans+to_string(r)+","+to_string(c)=")");

            setting of 
             col^=w;
            diag^=x;
            adiag^=y;

            



        }
    }

}

    


int main()
{
    int col=0;
    int diag=0;
    int adiag=0;
    cout<<Nqueen(c,0,r,col,diag,adiag)<<endl;


}