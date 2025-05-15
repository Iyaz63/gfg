//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
    stack<int> mainStack;
    stack<int> minStack; // stores minimums

  public:
    Solution() {
        // Initialize stacks (default constructor does this)
        while (!mainStack.empty()) mainStack.pop();
        while (!minStack.empty()) minStack.pop();
    }

    // Add an element to the top of Stack
    void push(int x) {
        mainStack.push(x);
        if (minStack.empty() || x <= minStack.top())
            minStack.push(x);
    }

    // Remove the top element from the Stack
    void pop() {
        if (mainStack.empty()) return;
        if (mainStack.top() == minStack.top())
            minStack.pop();
        mainStack.pop();
    }

    // Returns top element of the Stack
    int peek() {
        if (mainStack.empty()) return -1;
        return mainStack.top();
    }

    // Finds minimum element of Stack
    int getMin() {
        if (minStack.empty()) return -1;
        return minStack.top();
    }
};



//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int q;
        cin >> q;

        Solution ob;

        while (q--) {
            int qt;
            cin >> qt;

            if (qt == 1) {
                // push
                int att;
                cin >> att;
                ob.push(att);
            } else if (qt == 2) {
                // pop
                ob.pop();
            } else if (qt == 3) {
                // peek
                cout << ob.peek() << " ";
            } else if (qt == 4) {
                // getMin
                cout << ob.getMin() << " ";
            }
        }
        cout << endl;
        cout << "~" << endl;
    }

    return 0;
}

// } Driver Code Ends