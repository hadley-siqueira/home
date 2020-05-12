#include <stdio.h>

int main() {
    for (int c = 1; c <= 50; c++) {
        if (c % 2 == 0) {
            continue;
        }
        printf("%i\n", c);
    }
}
