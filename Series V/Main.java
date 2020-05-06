#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int b=121;
  std::cout<<b<<" ";
  for(int i=1;i<n;i++){
    int c=(11+(4*i));
    int d=c*c;
    std::cout<<d<<" ";
  }
}