// C Program to Remove all Characters in a String Except Alphabet

// C programming source code to remove all characters in a string except alphabet...

#include<stdio.h>

int main()
{
    char line[150];
    int i, j;
    printf("Enter a string: ");
    gets(line);

    for(i = 0; line[i] != '\0'; ++i)
    {
        while (!( (line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z') || line[i] == '\0') )
        {
            for(j = i; line[j] != '\0'; ++j)
            {
                line[j] = line[j+1];
            }
            line[j] = '\0';
        }
    }
    printf("Output String: ");
    puts(line);
    return 0;
}

// https://www.programiz.com/c-programming/examples/remove-characters-string