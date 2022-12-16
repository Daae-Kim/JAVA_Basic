#include<iostream>
using namespace std;

int main(){

    int n;
    int m =0;
    cin >> n;

    for(int i=0; i<=n; i++){
        m += (n-i);
    }
    cout << m;
 
    return 0;
}