#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m,k;
  int p,d;
  cin>>m;
  cin>>p>>d;
  k=p*m;
  if(d>k)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}