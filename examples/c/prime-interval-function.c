// C Program to Display Prime Numbers Between Intervals Using Function

// Example to print all prime numbers between two numbers (entered by the user) by making a user-defined function.

#include <stdio.h>

int checkPrimeNumber(int n);
int main()
{
    int n1, n2, i, flag;

    printf("Enter two positive integers: ");
    scanf("%d %d", &n1, &n2);
    printf("Prime numbers between %d and %d are: ", n1, n2);

    for(i=n1+1; i<n2; ++i)
    {
        // i is a prime number, flag will be equal to 1
        flag = checkPrimeNumber(i);

        if(flag == 1)
            printf("%d ",i);
    }
    return 0;
}

// user-defined function to check prime number
int checkPrimeNumber(int n)
{
    int j, flag = 1;

    for(j=2; j <= n/2; ++j)
    {
        if (n%j == 0)
        {
            flag =0;
            break;
        }
    }
    return flag;
}

// https://www.programiz.com/c-programming/examples/prime-interval-function