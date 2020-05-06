#include<iostream>
using namespace std;
int main()
{
  float a;
  int b,c,d;
  std::cin>>a>>b>>c;
  d=a*b;
  if(d<c)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
}