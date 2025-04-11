// C Program to Display Armstrong Number Between Two Intervals

// Example to find all Armstrong numbers between two integers (entered by the user) using loops and if...else statement.

#include <stdio.h>
#include <math.h>

int main()
{
    int low, high, i, temp1, temp2, remainder, n = 0, result = 0;

    printf("Enter two numbers(intervals): ");
    scanf("%d %d", &low, &high);
    printf("Armstrong numbers between %d an %d are: ", low, high);

    for(i = low + 1; i < high; ++i)
    {
        temp2 = i;
        temp1 = i;

        // number of digits calculation
        while (temp1 != 0)
        {
            temp1 /= 10;
            ++n;
        }

        // result contains sum of nth power of its digits
        while (temp2 != 0)
        {
            remainder = temp2 % 10;
            result += pow(remainder, n);
            temp2 /= 10;
        }

        // checks if number i is equal to the sum of nth power of its digits
        if (result == i) {
            printf("%d ", i);
        }

        // resetting the values to check Armstrong number for next iteration
        n = 0;
        result = 0;

    }
    return 0;
}

// https://www.programiz.com/c-programming/examples/armstrong-number-interval