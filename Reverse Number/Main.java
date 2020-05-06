#include <iostream>
int main() 
{
  int a,rev=0,b;
  std::cin>>a;
  while(a>0)
  {
    b=a%10;
    rev=rev*10+b;
    a/=10;
  }
  std::cout<<rev;
}