class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        //find the pivot
        int n = nums.size();
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverse(nums.begin(), nums.end());
            return;
        }
        // next larger element
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums[i], nums[pivot]);
                break;
            }
        }
        // reverse Pivot+1 to n-1
        reverse(nums.begin() + pivot + 1, nums.end());
    }
};