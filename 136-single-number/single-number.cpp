class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int unique = 0;
        for (int val: nums) {
            unique ^= val;
        }
        return unique;
    }
};