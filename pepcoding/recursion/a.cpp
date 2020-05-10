#include <iostream>
#include <vector>
#include <climits>
using namespace std;

long long int main(vector<long> arr) 
{

        int n = int(arr.size());

	long long int result = INT_MAX;
	long long int arr1;
	for( int i = 0; i < n; i++ ) {
		cin >> arr1;
		if ( arr[i] != 0 ) {
			arr1 = int(arr1/arr[i]);
			if ( result > arr1 ) {
				result = arr1;
			}
		}
	}
	return result;
}
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    	int n;
    	cin >> n;


	vector<long> arr(n);
	for( int i = 0; i < n; i++ )
    {
		cin >> arr[i];
	}
	
	cout << main(arr) << "\n"; 
	return 0;
}