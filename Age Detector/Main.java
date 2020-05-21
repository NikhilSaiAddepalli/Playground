#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy,age;
  cin>>by>>cy;
  if(by<cy){
    age=cy-by;
  cout<<age;}
  else{
    age=(100-by)+cy;
   cout<<age;
}
}