#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'extraLongFactorials' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

void extraLongFactorials(int n) {
    vector<unsigned int> factorial;
    factorial.push_back(1);
    int base = 100000000;
    for (int i = 1; i <= n; i++) {
        unsigned long long sum = 0;
        vector<unsigned int>::iterator it = factorial.begin();
        while ( it != factorial.end() )  {
          sum += (unsigned long long) (*it) * i;
          (*it) = (unsigned int) (sum % base);
          sum /= base;
          ++it;
        }

        if (sum) factorial.push_back((unsigned int) sum);
    }

    for( int i = factorial.size() - 1; i >= 0; i-- ){
        if ( i != factorial.size() - 1 && factorial[i] < 10000000 ) {
            int num_zeros = 0;
            unsigned int acum = factorial[i];
            while ( acum > 0 ) {
                num_zeros++;
                acum = (int) acum/10;
            }
            if (num_zeros != 0) {
              for (int i = 0; i < 8-num_zeros; i++) cout << 0;
              cout << factorial[i];
            } else{
              cout << "00000000";
            }
        } else {
            cout << factorial[i];
        }
    }
}

int main()
{

    int n = 58; 

    extraLongFactorials(n);

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}

