class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
    int n = nums.length;
    int nxtGrt[] = new int[n];
    for (int i = 0; i < n; i++) {
        nxtGrt[i] = -1;
    }
    for (int i = 2*n - 1; i >= 0; i--) {
        int index = i % n;
        while (!s.isEmpty() && nums[s.peek()] <= nums[index]) {
            s.pop();
        }

        if (i < n) {
            if (s.isEmpty()) {
                nxtGrt[index] = -1;
            }
            else {
                nxtGrt[index] = nums[s.peek()];
            }
        }

        s.push(index);
    }
    return nxtGrt;
    }
}