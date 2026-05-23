class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxWater = 0;
        int lp = 0; 
        int rp = height.size() - 1;
        while (lp < rp) {
            int wdt = rp - lp;
            int hgt = min(height[lp], height[rp]);
            int currWater = wdt * hgt;
            maxWater = max(maxWater, currWater);

            height[lp] < height[rp] ? lp++ : rp--;
        }
        return maxWater;
    }
};