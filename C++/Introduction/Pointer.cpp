#include <stdio.h>
#include <cmath>

using namespace std;

void update(int& a,int& b) {
    int ta = a;
    int tb = b;
    a = ta + tb;
    b = abs(ta - tb);
}

int main() {
    int a, b;

    scanf("%d %d", &a, &b);
    update(a, b);
    printf("%d\n%d", a, b);

    return 0;
}
