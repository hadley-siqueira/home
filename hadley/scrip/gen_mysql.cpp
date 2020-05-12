#include <iostream>
using namespace std;

int main() {
    string user;

    while (cin >> user) {
        cout << "DROP USER '" << user << "'@'localhost';\n";
        cout << "CREATE USER '" << user << "'@'localhost' IDENTIFIED BY '1234';\n";
        cout << "GRANT ALL PRIVILEGES ON `" << user << "_%` . * TO '" << user << "'@'localhost';\n";
    }
}
