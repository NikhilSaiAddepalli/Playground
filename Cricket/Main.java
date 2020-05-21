#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  float tb,trs,rs;
  int bb;
  float ob,crr,trr;
  cin>>tb>>trs>>rs>>bb;
  cout<<"50\n";
  ob=(bb/6)+(bb%6)*0.1;
  cout<<fixed<<setprecision(1)<<ob<<endl;
  crr=rs/ob;
  cout<<fixed<<setprecision(1)<<crr<<endl;
  trr=trs/50;
  cout<<fixed<<setprecision(1)<<trr<<endl;
  if(crr>trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}