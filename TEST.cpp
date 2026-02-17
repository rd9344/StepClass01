#include <iostream>
int main(){
    int n=0;
    std::cout << "Enter how many natural numbers u want to print: ";
    std::cin >> n;
    for(int i=1;i<=n;i++){
        std::cout <<i <<" ";
    }
    return 0;
}