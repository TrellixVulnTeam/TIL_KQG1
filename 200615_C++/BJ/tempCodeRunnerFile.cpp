#include <iostream>

using namespace std;
int main()
{

    int tcase, size, total, avg;
    double cnt, result;
    cin >> tcase;

    for (int i = 0; i < tcase; i++)
    {
        cin >> size;
        int arr[size];
        for (int i = 0; i < size; i++)
        {

            cin >> arr[i];
            total += arr[i];
        }
        avg = total / size;

        for (int i = 0; i < size; i++)
        {
            if (avg < arr[i])
            {
                cnt++;
            }
        }
        result = cnt / size * 100;
        cout << fixed;
        cout << result << endl;
    }

    return 0;
}
