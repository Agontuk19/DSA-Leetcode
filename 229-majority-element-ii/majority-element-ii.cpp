class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n = nums.size();
        int freq1 = 0; int elem1 = 0;
        int freq2 = 0; int elem2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == elem1) {
                freq1++;
            }
            else if (nums[i] == elem2) {
                freq2++;
            }
            else if (freq1 == 0) {
                elem1 = nums[i];
                freq1 = 1;
            }
            else if (freq2 == 0) {
                elem2 = nums[i];
                freq2 = 1;
            }
            else {
                freq1--;
                freq2--;
            }
        }
        int count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == elem1) count1++;
            else if (nums[i] == elem2) count2++;
        }
        
        vector<int> val;
        if (count1 > n/3) val.push_back(elem1);
        if (count2 > n/3) val.push_back(elem2);
        return val;
    }
};