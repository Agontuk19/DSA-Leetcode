class Solution {
public:
    bool isValid(vector<int>& arr, int n, int k, int maxVal) {
        int elem = 1, val = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                return false;
            }

            if (val + arr[i] <= maxVal) {
                val += arr[i];
            }
            else {
                elem++;
                val = arr[i];
            }
        }
        return elem > k ? false : true;
    }

    int splitArray(vector<int>& nums, int k) {
        int n = nums.size();
        int max = -1;

        // If try to split in more number of sub array than the number of elements, it is invalid case
        if (k > n) {
            return max;
        }

        // Finding out the range 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        // Binary Search on the range array (Abstract)
        int st = 0, end = sum;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isValid(nums, n, k, mid)) {
                max = mid;
                end = mid - 1;
            }
            else {
                st = mid + 1;
            }
        }
        return max;
    }
};