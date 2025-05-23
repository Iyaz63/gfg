// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();
        int first = findFirst(arr, x);
        int last = findLast(arr, x);
        result.add(first);
        result.add(last);
        return result;
    }

    int findFirst(int[] arr, int x) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    int findLast(int[] arr, int x) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
