#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  std::cout<<"Enter first number "<<": "<<"Enter second number "<<": "<<"Menu"<<endl;
  std::cout<<"1.Addition"<<endl;
  std::cout<<"2.Subtraction"<<endl;
  std::cout<<"3.Multiplication"<<endl;
  std::cout<<"4.Division"<<endl;
  std::cout<<"5.Remainder"<<endl;
  switch(c){
    case 1:
      std::cout<<a+b;
      break;
    case 2:
      std::cout<<a-b;
      break;
    case 3:
      std::cout<<a*b;
      break;
    case 4:
      std::cout<<a/b;
      break;
    case 5:
      std::cout<<a%b;
      break;
    default:
      std::cout<<"Invalid operation";
      break;
  }
}