#include <stdio.h>

void foo();

int main(int a, const char*b[]) {
	foo();
}

void foo() {
	printf("test\n");
}
