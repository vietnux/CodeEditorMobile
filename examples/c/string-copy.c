// C Program to Copy String Without Using strcpy()

// C programming source code to copy string manually without using strcpy() function...

#include <stdio.h>
int main()
{
    char s1[100], s2[100], i;

    printf("Enter string s1: ");
    scanf("%s",s1);

    for(i = 0; s1[i] != '\0'; ++i)
    {
        s2[i] = s1[i];
    }

    s2[i] = '\0';
    printf("String s2: %s", s2);

    return 0;
}

// https://www.programiz.com/c-programming/examples/string-copy