#include<iostream>
using namespace std;
int main()
{
  int n,c;
  std::cin>>n;
  for(int i=1;i<=n;i++){
    int b=i*i;
    if(i%2!=0)
      c=b-1;
    else
      c=b-2;
    std::cout<<c<<" ";
  }
}