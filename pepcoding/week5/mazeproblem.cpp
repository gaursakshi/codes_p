#include<iostream>
#include<vector>
using namespace std;

vector<string>mazepath_d(int sr,int sc,int er,int ec)
{

    vector<string>myans;
    vector<string>base;
    //base case

    if(sr==er && sc==ec)
    {
        base.push_back("");
        return base;
    }


    if(sc+1<=ec)
    {
        vector<string>horizontal=mazepath_d(sr,sc+1,er,ec);

        for(string s:horizontal)
        {
            myans.push_back("H"+s);
        }
    }


     if(sr+1<=er)
    {
        vector<string>vertical=mazepath_d(sr+1,sc,er,ec);

        for(string s:vertical)
        {
            myans.push_back("V"+s);
        }
    }


     if(sr+1<=er && sc+1<=ec)
    {
        vector<string>diagonal=mazepath_d(sr+1,sc+1,er,ec);

        for(string s:diagonal)
        {
            myans.push_back("D"+s);
        }
    }
    return myans;


}


vector<string>mazepath_multiplejump(int sr,int sc,int er,int ec)
{

    vector<string>myans;
    vector<string>base;
    //base case

    if(sr==er && sc==ec)
    {
        base.push_back("");
        return base;
    }


   for(int jump=1;sc+jump<=ec;jump++)
   {
     vector<string>horizontal=mazepath_multiplejump(sr,sc+jump,er,ec);

        for(string s:horizontal)
        {
            myans.push_back("H"+to_string(jump)+s);
        }
    }

 for(int jump=1;sr+jump<=er;jump++)
   {
     
   
        vector<string>vertical=mazepath_multiplejump(sr+jump,sc,er,ec);

        for(string s:vertical)
        {
            myans.push_back("V"+to_string(jump)+s);
        }
    }


for(int jump=1; sr+jump<=er && sc+jump<=ec;jump++)
   {
      
        vector<string>diagonal=mazepath_multiplejump(sr+jump,sc+jump,er,ec);

        for(string s:diagonal)
        {
            myans.push_back("D"+to_string(jump)+s);
        }
    }
    return myans;


}



int mazepath_height(int sr,int sc,int er,int ec)
{

    vector<string>myans;
    vector<string>base;
    //base case

    int horizontal=0,vertical=0,diagonal=0;

    if(sr==er && sc==ec)
    {
       return 0;
    }


    if(sc+1<=ec)
    {
         horizontal=mazepath_height(sr,sc+1,er,ec);

       
    }


     if(sr+1<=er)
    {
         vertical=mazepath_height(sr+1,sc,er,ec);

        
    }


     if(sr+1<=er && sc+1<=ec)
    {
         diagonal=mazepath_height(sr+1,sc+1,er,ec);

      
    }
    int finalheight=max(horizontal,max(vertical,diagonal))+1;
    return finalheight;


}

int main()
{
    /*vector<string>ans=mazepath_d(0,0,3,3);
    for(string s:ans)
    {
        cout<<s<<endl;
    }*/

    //cout<<mazepath_height(0,0,3,3);


    vector<string>ans=mazepath_multiplejump(0,0,3,3);
    for(string s:ans)
    {
        cout<<s<<endl;
    }





}