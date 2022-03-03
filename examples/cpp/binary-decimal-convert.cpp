// C++ Program to Convert Binary Number to Decimal and vice-versa

// In this example, you will learn to convert binary number to decimal, and decimal number to binary manually by creating user-defined functions.

#include <iostream>
#include <cmath>

using namespace std;

int convertBinaryToDecimal(long long);

int main()
{
    long long n;

    cout << "Enter a binary number: ";
    cin >> n;
 
    cout << n << " in binary = " << convertBinaryToDecimal(n) << "in decimal";
    return 0;
}

int convertBinaryToDecimal(long long n)
{
    int decimalNumber = 0, i = 0, remainder;
    while (n!=0)
    {
        remainder = n%10;
        n /= 10;
        decimalNumber += remainder*pow(2,i);
        ++i;
    }
    return decimalNumber;
}

// https://www.programiz.com/cpp-programming/examples/binary-decimal-convert