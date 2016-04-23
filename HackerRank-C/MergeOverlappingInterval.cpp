//
// Created by Darshan Modh on 4/22/16.
//

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


struct Interval {
    int start;
    int end;
    Interval() : start(0), end(0) {}
    Interval(int s, int e) : start(s), end(e) {}
};

struct StartOrder {
    bool operator() (const Interval &a, const Interval &b) {
        return a.start < b.start;
    }
}startorder;


vector<Interval> MergeIntervals(vector<Interval> &intervals) {
    if (intervals.size() < 2) return intervals;
    sort(intervals.begin(), intervals.end(), startorder);
    vector<Interval> result;
    Interval curInterval;
    vector<Interval>::iterator it = intervals.begin();
    while (it != intervals.end()) {
        if (it == intervals.begin()) {
            curInterval = *it;
        } else if ((*it).start <= curInterval.end && curInterval.start <= (*it).end) {

            curInterval.start = (curInterval.start > (*it).start) ? (*it).start : curInterval.start;
            curInterval.end = ((curInterval.end < (*it).end) ? (*it).end : curInterval.end);
        } else if ((*it).start > curInterval.end) {
            result.push_back(curInterval);
            curInterval = *it;
        }
        it++;
     }
     result.push_back(curInterval);
     return result;
}


void PrintIntervals(vector<Interval> input){

    vector<Interval>::iterator it = input.begin();
    for(; it != input.end(); it++){

        cout<<"["<<(*it).start<<","<<(*it).end<<"]"<<" ";
    
	}
    cout<<endl;
}

int main(){

    vector<Interval> intervals;
    Interval interval1 = Interval(1,3);
    Interval interval2 = Interval(2,6);
    Interval interval3 = Interval(8,10);
    Interval interval4 = Interval(15,18);
    intervals.push_back(interval1);
    intervals.push_back(interval2);
    intervals.push_back(interval3);
    intervals.push_back(interval4);
    PrintIntervals(intervals);
    vector<Interval> result = MergeIntervals(intervals);
    PrintIntervals(result);
    return 0;
}

