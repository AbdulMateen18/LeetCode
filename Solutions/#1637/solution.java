class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        //Sort 2D array on the basis of first element/x-coordinate
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int max_width = 0;

        for (int j = 1; j < points.length; j++) {
            int width = points[j][0] - points[j - 1][0];
            max_width = Math.max(max_width, width);
        }

        return max_width;
    }
}