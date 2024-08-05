#include <iostream>
#include <sstream>
#include <set>

int main(){
    std::string input = "Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53\nCard 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19\nCard 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1\nCard 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83\nCard 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36\nCard 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11";

    std::istringstream ss(input);
    std::string line;
    int points = 0;

    while(std::getline(ss, line)){
        std::set<int> winning, myNumbers;
        std::istringstream cardStream(line.substr(line.find(":") + 1));
        int num;
        while (cardStream >> num) {
            winning.insert(num);
        }
        std::istringstream numberStream(line.substr(line.find("|") + 1));
        while (numberStream >> num){
            myNumbers.insert(num);
        }

        int matches = 0;
        for (auto&& i : myNumbers){
            if (winning.find(i) != winning.end()){
                matches++;
            }
        }
        int currentPoints = 0;
        if (matches > 0){
            currentPoints++;
        }

        for (int i = 1; i < matches; i++){
            currentPoints *= 2;
        }

        points += currentPoints;
    }

    std::cout << points;
}