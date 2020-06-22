#include <iostream>
#include <cstring>

using namespace std;
#define MAX 10

int main()
{

    struct meminfo
    {
        char name[20];
        int salary;
    };

    meminfo person[MAX] = {
        {"김대표", 100000},
        {"이부장", 70000},
        {"홍과장", 40000},

    };

    meminfo *ptr;

    ptr = person;

    int count = 3;

    for (; count < MAX; count++)
    {
        cout << "이름은 ? ";
        cin >> (ptr + count)->name;
        // 프로그램 종료
        if (strcmp((ptr + count)->name, "end") == 0)
            break;
        cout << "연봉은 ? ";
        cin >> (ptr + count)->salary;
    }

    for (count--; count >= 0; count--)
    {
        cout << (ptr + count)->name << "의 연봉은 "
             << (ptr + count)->salary << "입니다 " << endl;
    }

    //출력 시 count변수에 마지막에 입력된 원소의 위치가 저장되어 있으므로 마지막 원소부터 첫번째 원소의 순서로 출력돔.
    return 0;
}