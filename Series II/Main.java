#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int d=121;
  std::cout<<d<<" ";
  for(int i=1;i<n;i++){
    int b=(11+(4*i));
    int c=b*b;
    std::cout<<c<<" ";
  }
}