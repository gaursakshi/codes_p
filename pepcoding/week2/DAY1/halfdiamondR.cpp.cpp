#include<iostream>
using namespace std;

void halfdiamond(int rows)
{
	
	int nst=1;
	int nsp=rows-1;
	
	for(int r=1;r<=rows;r++)
	{
		for(int csp=1;csp<=nsp;csp++)
		{
			cout<<" ";
		}
		
		for(int cst=1;cst<=nst;cst++)
		{
			cout<<"*";
		}
		
		
	
	nst++;
	nsp--;
	cout<<endl;

}
	
}
int main()
{
	int rows;
	cout<<"enter the number of rows";
	cin>>rows;
	
	halfdiamond(rows);
	
	
}
