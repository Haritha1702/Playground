#include<iostream>
int main(){
  int a,f=1;
  std::cin>>a;
  for(int i=1;i<=a;i++){
    f=i*f;
  }
  std::cout<<f;
  
}