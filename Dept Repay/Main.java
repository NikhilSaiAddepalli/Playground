#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i,a,d,fa;
  cin>>p>>r>>t;
  i=(p*r*t)/100;
  a=(p+i);
  d=(i*2)/100;
  fa=(a-d);
  std::cout<<i<<"\n";
  std::cout<<a<<"\n";
  std::cout<<d<<"\n";
  std::cout<<fa<<"\n";
}