#include<iostream>
using namespace std;
int main()
{
  int a,b,r,x;
  cout<<"Enter first number :";
  cin>>a;
  cout<<" Enter second number :";
  cin>>b;
  cout<<" Menu\n";
  cout<<"1.Addition\n";
cout<<"2.Subtraction\n";
cout<<"3.Multiplication\n";
cout<<"4.Division\n";
cout<<"5.Remainder\n";
  cin>>r;
  switch(r)
  {
    case 1:
  x=a+b;cout<<x;
      break;
    case 2:
  x=a-b;cout<<x;
      break;
      case 3:
  x=a*b;cout<<x;
      break;
      case 4:
  x=a/b;cout<<x;
      break;
      case 5:
  x=a%b;cout<<x;
      break;
      default :
      cout<<"Invalid operation";
  }
}