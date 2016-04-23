//
// Created by Darshan Modh on 4/22/16.
//

#include <iostream>
#include <vector>

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

struct EndOrder {
    bool operator() (const Interval &a, const Interval &b) {
        return a.end < b.end;
    }
}endorder;

int maxIntervals(vector<Interval> &intervals) {
    int n = intervals.size();

    if (intervals.size() < 2)
        return 1;
    sort(intervals.begin(), intervals.end(), startorder);
    sort(intervals.begin(), intervals.end(), endorder);

    int in=1, max_overlap=1;
    int i = 1, j = 0;
    while (i < n && j < n)
    {
        if (intervals[i].start <= intervals[j].end)
        {
            in++;
            if (in > max_overlap)
            {
                max_overlap = in;
            }
            i++;
        }
        else
        {
            in--;
            j++;
        }
    }
    return max_overlap;







/*
    int numActive = 0;
    int numOverlap = 0;
    Interval curInterval;
    vector<Interval>::iterator it = intervals.begin();

    while (it != intervals.end()) {
        cout << "it Start = " << (*it).start << endl;
        cout << "curr End = " << curInterval.end << endl;
        cout << "curr Start = " << curInterval.start << endl;
        cout << "it End = " << (*it).end << endl;

        if(it == intervals.begin()) {
            curInterval = *it;
            numActive++;
        } else if((*it).start < curInterval.end) {

                cout << "Increment" << endl;
                numActive++;
                numOverlap = max(numOverlap, numActive);
                //curInterval.start = (*it).start;
                curInterval.start = (curInterval.start > (*it).start) ? (*it).start : curInterval.start;
                curInterval.end = (curInterval.end < (*it).end) ? (*it).end : curInterval.end;

        } else if((*it).start >= curInterval.end) {
            cout << "Decrement" << endl;
            numActive = 1;
            curInterval.start = (*it).start;
            curInterval.end = (*it).end;
        }
        it++;
        cout << "=============================" << endl;
    }
    numOverlap = max(numOverlap, numActive);
    return numOverlap;
    */
}

int main() {
    vector<Interval> intervals;
//    Interval interval1 = Interval(0,2);
//    Interval interval2 = Interval(1,5);
//    Interval interval3 = Interval(3,7);
//    Interval interval4 = Interval(4,6);
//    Interval interval5 = Interval(7,8);


//    Interval interval1 = Interval(1,3);
//    Interval interval2 = Interval(2,4);
//    Interval interval3 = Interval(4,7);
//    Interval interval4 = Interval(5,6);


//    Interval interval1 = Interval(1,3);
//    Interval interval2 = Interval(2,6);
//    Interval interval3 = Interval(8,10);
//    Interval interval4 = Interval(15,18);


    Interval interval1 = Interval(1,7);
    Interval interval2 = Interval(2,3);
    Interval interval3 = Interval(4,5);


    intervals.push_back(interval1);
    intervals.push_back(interval2);
    intervals.push_back(interval3);
//    intervals.push_back(interval4);
//    intervals.push_back(interval5);
    int result = maxIntervals(intervals);
    cout << result << endl;
    return 0;
}
