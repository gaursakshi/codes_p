#include<iostream>
#include<vector>
using namespace std;
void subseq(string str,string ans)
{
    if(str.length()==0)
    {
        cout<<ans<<endl;
        return ;
    }

     //when it does not return anything
    subseq(str.substr(1),ans);
    subseq(str.substr(1),ans+str[0]);

}

int subsequsingcount(string str,string ans)
{
    if(str.length()==0)
    {
        cout<<ans<<endl;
        return 1  ;
    }

     //when it does not return anything
     int count=0;
    count+=subsequsingcount(str.substr(1),ans);
    count+=subsequsingcount(str.substr(1),ans+str[0]);
return count;
}

vector<string> words={"_","+-/","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","*%()","#@$"};
int keypad(string ques,string ans)
{
    if(ques.length()==0)
    {
        cout<<ans<<endl;
        return 1;
    }
    int count=0;
    int idx1=ques[0]-'0';
    string word=words[idx1];

    for(int i=0;i<word.length();i++)
    {
        count+=keypad(ques.substr(1),ans+word[i]);
    }

    //case 1011 wala 
    if(ques.length()>=2)
    {
        //converting string into integer
        int idx=idx1*10+(ques[1]-'0');
        if(idx>=10 && idx<=11)
        {
            word=words[idx];
             for(int i=0;i<word.length();i++)
        {
             count+=keypad(ques.substr(2),ans+word[i]);

        }
        }


        

    }

    return count;

}

//permumation
int permumtation(string ques,string ans)
{
    int count=0;
    //base case
    if(ques.length()==0)
    {
        cout<<ans<<endl;
        return 1;
    }
    //faith is permumation will start with taking character a
    for(int i=0;i<ques.length();i++)
    {
        string str=ques.substr(0,i)+ques.substr(i+1);

        count+=permumtation(str,ans+ques[i]);
    }
    return count;
}

int permumtationusingduplicacy (string ques,string ans)
{
    int count=0; 
    int arr=0; //bit array
    
    //base case
    if(ques.length()==0)
    {
        cout<<ans<<endl;
        return 1;
    }
    //faith is permumation will start with taking character a
    for(int i=0;i<ques.length();i++)
    {
        int mask=1<<(ques[i]-'a');
        //arr=mask;
        //arr&=(~mask);
        if((arr&mask)==0)
        {
            arr|=mask;
            
        string str=ques.substr(0,i)+ques.substr(i+1);

        count+=permumtationusingduplicacy(str,ans+ques[i]);
        }
    }
    return count;
}

int permumationCoinInfinite(vector<int> &arr,int target,string ans)
{
    //base case
    if(target==0)
    {
        cout<<ans<<endl;
        return 0;
    }

    int count=0;
    for(int i=0;i<arr.size();i++)
    {
        if(target-arr[i]>=0)
        {
            count+=permumationCoinInfinite(arr,target-arr[i],ans+to_string(arr[i]));
        }
    }
    return count;


}





 void basicques()
 {
     //subseq("abc","");

     //cout<<subsequsingcount("abc","");
     //cout<<keypad("1011","");
     //cout<<permumtation("abc","");
     //cout<<permumtationusingduplicacy("aba","");
       vector<int>arr={2,3,5,7};
    cout<<permumationCoinInfinite(arr,10,"");


 }
void solve()
{
    basicques();

}
int main()
{
    solve();
}