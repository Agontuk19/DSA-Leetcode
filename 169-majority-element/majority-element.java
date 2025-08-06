class Solution {
    public int majorityElement(int[] nums) {
        return count(nums);
    }
    public static int count(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length / 2;
        return arr[n];
    }
}