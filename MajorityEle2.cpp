#include<iostream>
#include<vector>
#include<climits>
#include<algorithm>
using namespace std;
int main()
{
    vector<int>v = {1,2,2,1,1};
    int n = v.size();

    sort(v.begin(),v.end());

    int ans = v[0] , freq = 1;

    for(int i = 1;i<n;i++){

        if(v[i] == ans){

            freq++;

        }

        else{

            ans = v[i];
            freq = 1;

        }

        if(freq>n/2){

            cout<<ans<<'\n';
            break;

        }

    }
    
    return 0;
    
}