#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,x;
  cin>>a;
  if(a>1000)
    x=a%10+1;
  else
    x=a%10;
  cout<<x;
}