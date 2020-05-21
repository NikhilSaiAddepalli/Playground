#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  float p1,d1,s1,p2,d2,s2,p3,d3,s3,e1,e2,e3;
  cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
   e1=p1-(d1/100)*p1+s1; 
  e2=p2-(d2/100)*p2+s2;
  e3=p3-(d3/100)*p3+s3;
  cout<<"In Flipkart Rs."<<fixed<<setprecision(0)<<e1<<"\n";
  cout<<"In Snapdeal Rs."<<fixed<<setprecision(0)<<e2<<"\n";
  cout<<"In Amazon Rs."<<fixed<<setprecision(0)<<e3<<"\n";
  if(e1<=e2&&e1<=e3)
    cout<<"He will prefer Flipkart";
  else if(e2<e1&&e2<e3)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}