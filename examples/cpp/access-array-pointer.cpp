// C++ Program to Access Elements of an Array Using Pointer

// This program declares the array of five element and the elements of that array are accessed using pointer.

#include <iostream>
using namespace std;

int main()
{
   int data[5];
   cout << "Enter elements: ";

   for(int i = 0; i < 5; ++i)
      cin >> data[i];

   cout << "You entered: ";
   for(int i = 0; i < 5; ++i)
      cout << endl << *(data + i);

   return 0;
}

// https://www.programiz.com/cpp-programming/examples/access-array-pointer