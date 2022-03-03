// C++ program to Find Sum of Natural Numbers using Recursion

// Example to find the sum of natural numbers by using a recursive function.

#include<iostream>
using namespace std;

int add(int n);

int main()
{
    int n;

    cout << "Enter a positive integer: ";
    cin >> n;

    cout << "Sum =  " << add(n);

    return 0;
}

int add(int n)
{
    if(n != 0)
        return n + add(n - 1);
    return 0;
}

// https://www.programiz.com/cpp-programming/examples/natural-number-sum-recursion