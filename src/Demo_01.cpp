#include <iostream>
#include <sstream>

int main() {
    std::string input = "1abc2\npqr3stu8vwx\na1b2c3d4e5f\ntreb7uchet\n";

    std::istringstream ss(input);
    std::string line;
    int sum = 0;

    while (std::getline(ss, line)) {
        char first = ' ', last = ' ';
        for (int i = 0; i < line.length(); i++) {
            char c = line[i];
            if (c < '9' && c > '0') {
                if (first == ' ') {
                    first = c;
                }
                last = c;
            }
        }

        if (first != ' ') {
            sum += (first - 48) * 10 + (last - 48);
        }
    }

    std::cout << sum;

    return 0;
}
