class Solution {
    public int trap(int[] height) {
        int l = height.length;
        //Left Max Array
        int leftMax[] = new int[l];
        leftMax[0] = height[0];
        for (int i = 1; i < l; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        //Right Max Array
        int rightMax[] = new int[l];
        rightMax[l - 1] = height[l - 1];
        for (int i = l - 2; i>= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        //Trappped Water
        int trappedWater = 0;
        for (int i = 0; i < l; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }
}