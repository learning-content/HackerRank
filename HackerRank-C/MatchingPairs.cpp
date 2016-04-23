//
// Created by Darshan Modh on 4/22/16.
//
#include <cmath>
#include <cstdio>
#include <vector>
#include <string>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;

int findMatchingPair(const string& input) {
    unsigned long len = input.length();
    int lastMatch = 0;
    int i,j;
    stack<int> mystack;
    if(input[0] >= 'a' && input[0] <= 'z')
        return -1;
    else {
        mystack.push(input[0]);
        for (i = 0; i < len; i++) {
            j  = i + 1;
            if(input[j] >= 'A' && input[j] <= 'Z') {
                mystack.push(input[j]);
            } else if(input[j] >= 'a' && input[j] <= 'z' && !mystack.empty()) {
                char top = mystack.top();
                if(toupper(input[j]) == top) {
                    lastMatch = j;
                    mystack.pop();
                } else {
                    break;
                }
            }
        }
    }
    if(!mystack.empty() && mystack.top()>='A' && mystack.top()<='Z')
        return lastMatch;
    if(mystack.empty())
        return lastMatch;
    return lastMatch-1;
}


int main() {
    string input;
    getline(cin, input);
    cout << findMatchingPair("PTtCNVvncp") << endl;
    return 0;
}
