#include <iostream>
#include <string>
using namespace std;

int main() {
	string a, b;
    cin >> a;
    cin >> b;

    cout << a.length() << ' ' << b.length() << endl;
    cout << a + b << endl;

    cout << b.substr(0, 1) << a.substr(1) << ' ' << a.substr(0, 1) << b.substr(1) << endl;

    return 0;
}