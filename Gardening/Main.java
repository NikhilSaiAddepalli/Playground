#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if(c>b&&c<=(b*2))
    cout<<"It is a mango tree";
  else if(c<=((b*b)-b)&&c>((b*b)-b*2))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}