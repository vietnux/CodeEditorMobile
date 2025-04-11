// C Program to Count Number of Digits in an Integer

// C programming source code to count number of digits in an integer entered by an user with output and explanation...

#include <stdio.h>
int main()
{
    long long n;
    int count = 0;

    printf("Enter an integer: ");
    scanf("%lld", &n);

    while(n != 0)
    {
        // n = n/10
        n /= 10;
        ++count;
    }

    printf("Number of digits: %d", count);
}

// https://www.programiz.com/c-programming/examples/digits-count