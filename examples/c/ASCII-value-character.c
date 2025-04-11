// C Program to Find ASCII Value of a Character

// This page contains source code to display ASCII value of a character enter by user...

#include <stdio.h>
int main()
{
    char c;
    printf("Enter a character: ");

    // Reads character input from the user
    scanf("%c", &c);  
    
    // %d displays the integer value of a character
    // %c displays the actual character
    printf("ASCII value of %c = %d", c, c);
    return 0;
}

// https://www.programiz.com/c-programming/examples/ASCII-value-character