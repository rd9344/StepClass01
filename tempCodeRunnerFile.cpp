#include <iostream>
using namespace std;

class Animal {//Created class Animal
    string name;
    int age;
public:
    Animal(string n, int a) {// Original constructor
        name = n;
        age = a;
    }
    Animal(const Animal &a) { // Copy constructor
        name = a.name;
        age = a.age;
        cout << "Animal Class copied" << endl;
    }
    void display() {
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};
int main() {
    Animal a1("Tiger", 5);  // Original object
    Animal a2 = a1;         // Copy constructor called
    a1.display();
    a2.display();
    return 0;
}
