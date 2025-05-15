//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    vector<double> getMedian(vector<int> &arr) {
        // code here
         vector<double> medians;
        priority_queue<int> maxHeap; // left side (smaller half)
        priority_queue<int, vector<int>, greater<int>> minHeap; // right side (larger half)

        for (int num : arr) {
            // Step 1: Add number to one of the heaps
            if (maxHeap.empty() || num <= maxHeap.top()) {
                maxHeap.push(num);
            } else {
                minHeap.push(num);
            }

            // Step 2: Balance the heaps sizes
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.push(maxHeap.top());
                maxHeap.pop();
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.push(minHeap.top());
                minHeap.pop();
            }

            // Step 3: Calculate median
            if (maxHeap.size() == minHeap.size()) {
                double median = (maxHeap.top() + minHeap.top()) / 2.0;
                medians.push_back(median);
            } else {
                medians.push_back(maxHeap.top());
            }
        }

        return medians;
        
    }
};



//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {

        string s;
        getline(cin, s);
        stringstream ss(s);
        vector<int> nums;
        int num;
        while (ss >> num) {
            nums.push_back(num);
        }
        Solution ob;
        vector<double> ans = ob.getMedian(nums);
        cout << fixed << setprecision(1);
        for (auto &i : ans)
            cout << i << " ";
        cout << "\n";
        cout << "~" << endl;
    }
    return 0;
}
// } Driver Code Ends