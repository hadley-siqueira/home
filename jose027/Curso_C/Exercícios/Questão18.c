#include <stdio.h>

int main() {
    int c1 = 7000;
    int c2 = 20000;

    printf("cidade1: %i habitantes\n", c1);
    printf("cidade2: %i habitantes\n", c2);

    while (c1 < c2) {
        c1 *= 1.035;
        c2 *= 1.01;
        printf("%i habitantes\n", c1);
        printf("%i habitantes\n", c2);
    }
}
