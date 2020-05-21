#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,k,st;
  cin>>a>>b>>c;
  if(a>b&&a<c||a>c&&a<b)
    cout<<"The treasure is in box which has number "<<a<<"\n";
  else if(b>a&&b<c||b>c&&b<a)
     cout<<"The treasure is in box which has number "<<b<<"\n";
  else
     cout<<"The treasure is in box which has number "<<c<<"\n";
  st=a<b?(a<c?a:c):(b<c?b:c);
  for(k=st;k>=1;k--)
  {
    if (a%k==0 && b%k==0 && c%k==0)
  		 break;
  }
  cout<<"The code to open the box is "<<k;
}