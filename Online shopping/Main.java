#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i,j,k,l;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  j=(a-((a*b)/100))+c;
  k=(d-((d*e)/100))+f;
  l=(g-((g*h)/100))+i;
  std::cout<<"In Flipkart "<<"Rs."<<j<<endl;
  std::cout<<"In Snapdeal "<<"Rs."<<k<<endl;
  std::cout<<"In Amazon "<<"Rs."<<l<<endl;
  if(j<k&&j<l)
    std::cout<<"He will prefer Flipkart"<<endl;
  else if(k<j&&k<l)
    std::cout<<"He will prefer Snapdeal"<<endl;
  else if(l<j&&l<k)
    std::cout<<"He will prefer Amazon"<<endl;
  else if(j==k)
    std::cout<<"He will prefer Flipkart"<<endl;
}