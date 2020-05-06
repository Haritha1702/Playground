#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(b==00)
    std::cout<<100-a;
  else if(a==00)
    std::cout<<b-a;
  else if(a<b)
    std::cout<<b-a;
  else if(a>b)
    std::cout<<(100-a)+b;
}