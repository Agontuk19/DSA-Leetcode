class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        int freq = 0, elem = 0;
        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                elem = nums[i];
            }
            if (elem == nums[i]) {
                freq++;
            }
            else {
                freq--;
            }
        }
        return elem;
    }
};