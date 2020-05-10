#include<iostream>
using namespace std;

void pattern(int rows)
{
	
	int nst=1;
	int nsp=rows/2;
	
	for(int r=1;r<=rows;r++)
	{
		for(int csp=1;csp<=nsp;csp++)
		{
			cout<<" ";
		}
		
		for(int cst=1;cst<=nst;cst++)
		{
			cout<<nst;
		}
		
		if(r<=rows/2)
		{
			nst+=1;
			nsp--;
			
		}
		
		else
		{
			nst-=2;
			nsp++;
		}
		
	
	
	
	cout<<endl;

}
	
}
int main()
{
	int rows;
	cout<<"enter the number of rows";
	cin>>rows;
	
	pattern(rows);
	
	
}
