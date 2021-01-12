#include <iostream>
using namespace std;

int main(){
    int N;
    double q;
    double l,tot;
    cin>>N;
    for (int i=0;i<N;i++){
      cin>>q;
      cin>>l;
      tot = q*l+tot;
    }
    cout<<tot;
   }