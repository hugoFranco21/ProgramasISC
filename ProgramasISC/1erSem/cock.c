#include <stdlib.h>
#include <stdio.h>

int main() {
    // insert code here...
    int a,b,c;

    printf ("Dame a: ");
    scanf ("%i", &a);
    printf ("Dame b: ");
    scanf ("%i", &b);
    printf ("Dame c: ");
    scanf ("%i", &c);

    if (a<b && a<c)
    {
            if (b<c)
                    printf ("%i, %i, %i",a,b,c);
                else
                        printf ("%i, %i, %i",a,c,b);
    }
    else
            if (b<a && b<c)
        {

            if (a<c)
                    printf ("%i, %i, %i",b,a,c);
            else
                     printf ("%i, %i, %i",b,c,a);
        }
        if (c<a && c<b)
            {
                    if(b<a)
                            printf ("%i, %i, %i",c,b,a);
                    else
                           printf ("%i, %i, %i",c,a,b);
                }
        
    return 0;
}
