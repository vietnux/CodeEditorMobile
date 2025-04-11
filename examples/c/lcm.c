// C Program to Find LCM of two Numbers

// This page contains source code, output and explanation to find LCM of two numbers in C programming. Learn more...

#include <stdio.h>
int main()
{
    int n1, n2, minMultiple;
    printf("Enter two positive integers: ");
    scanf("%d %d", &n1, &n2);

    // maximum number between n1 and n2 is stored in minMultiple
    minMultiple = (n1>n2) ? n1 : n2;

    // Always true
    while(1)
    {
        if( minMultiple%n1==0 && minMultiple%n2==0 )
        {
            printf("The LCM of %d and %d is %d.", n1, n2,minMultiple);
            break;
        }
        ++minMultiple;
    }
    return 0;
}

// https://www.programiz.com/c-programming/examples/lcm