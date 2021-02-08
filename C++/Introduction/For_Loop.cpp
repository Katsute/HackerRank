#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int i1, i2;

    cin >> i1 >> i2;

    for(int i = i1; i <= i2; i++){
        if(i <= 9)
            switch(i){
                case 0:
                    cout << "zero";
                    break;
                case 1:
                    cout << "one";
                    break;
                case 2:
                    cout << "two";
                    break;
                case 3:
                    cout << "three";
                    break;
                case 4:
                    cout << "four";
                    break;
                case 5:
                    cout << "five";
                    break;
                case 6:
                    cout << "six";
                    break;
                case 7:
                    cout << "seven";
                    break;
                case 8:
                    cout << "eight";
                    break;
                case 9:
                    cout << "nine";
                    break;
                default:
                    cout << "Greater than 9";
                    break;
            }
        else
            cout << ((i % 2 == 0) ? "even" : "odd");
        cout << '\n';
    }

    return 0;
}