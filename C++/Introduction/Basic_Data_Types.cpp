#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a;
    long b;
    char c;
    float d;
    double e;

    cin >> a >> b >> c >> d >> e;
    cout << a << '\n' << b << '\n' << c << '\n';
    printf("%f", d);
    cout << '\n';
    printf("%lf", e);

    return 0;
}