class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void sort(int arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }
        sort (arr, si, mid);
        sort (arr, mid + 1, ei);
        merge (arr, si, mid, ei);
    }
    public static void merge (int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp [] = new int [ei - si + 1];
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
