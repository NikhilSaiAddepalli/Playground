#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i=0;
  cin>>n;
 do
  {
    i++;
    n=n/10;
  }while(n>0);
  cout<<i;
}