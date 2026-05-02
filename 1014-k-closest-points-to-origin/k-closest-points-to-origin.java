class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((e1, e2) -> {
            return e2[0] - e1[0];
        });

        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int x = point[0];
            int y = point[1];
            int dist = (x * x) + (y * y);
            
            maxHeap.add(new int[] {dist, i});
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int result [][] = new int[k][2];
        for (int i = 0; i < k; i++) {
            int idx = maxHeap.poll()[1];
            result[i] = points[idx];
        }
        return result;
    }
}