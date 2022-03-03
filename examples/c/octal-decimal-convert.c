// C Program to Convert Octal Number to Decimal and vice-versa

// C programming source code to convert octal number entered by user to decimal number and decimal number entered by user to octal number....

#include <stdio.h>
#include <math.h>

int convertDecimalToOctal(int decimalNumber);
int main()
{
    int decimalNumber;

    printf("Enter a decimal number: ");
    scanf("%d", &decimalNumber);

    printf("%d in decimal = %d in octal", decimalNumber, convertDecimalToOctal(decimalNumber));

    return 0;
}

int convertDecimalToOctal(int decimalNumber)
{
    int octalNumber = 0, i = 1;

    while (decimalNumber != 0)
    {
        octalNumber += (decimalNumber % 8) * i;
        decimalNumber /= 8;
        i *= 10;
    }

    return octalNumber;
}

// https://www.programiz.com/c-programming/examples/octal-decimal-convert