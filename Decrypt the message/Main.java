#include<iostream>
using namespace std;
int main(){
  int n,m,i,sum=0;
  cin>>n>>m;
  m=m+n;
  n=m;
  for(i=1;i<n;i++)
  {
    if(m%i==0)
      sum = sum+i;
  }
  if(sum == n)
    cout<<"They can read the message";
  if (sum != n)
    cout<<"They can't read the message";
  return 0;
}