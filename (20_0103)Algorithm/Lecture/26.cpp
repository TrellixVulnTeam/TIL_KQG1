#include <stdio.h>

int main()
{

    int n;
    scanf("%d", &n);
    int a[n];

    int rank[n];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
        rank[i] = i + 1;
    }

    for (int i = 0; i < n; i++)
    {
        if (i == 0)
        {
            rank[0] = 1;
        }

        for (int j = i - 1; j >= 0; j--)
        {

            if (a[i] > a[j])
            {
                rank[i]--;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d ", rank[i]);
    }

    return 0;
}