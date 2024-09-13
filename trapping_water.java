class Solution {
    public int trap(int[] height) {
        int left = height[0];
        int sum = 0;
        if (0 != (height.length - 1)) {
            int[] arr = find(height, left, 1);
            int right = arr[0];
            sum = arr[1];
            if (right < height[0]) {
                right = height[0];
            }
            sum += mins(right, left) - height[0];
        }
        return sum;
    }

    int[] find(int[] height, int lefts, int i) {

        int left = lefts;
        if (i == (height.length - 1)) {
            if (left < height[i])
                left = height[i];
            int right = height[i];
            int sums = mins(right, left) - height[i];
            int[] arr = { right, sums };
            return arr;
        }

        if (left < height[i])
            left = height[i];
        int[] arr = find(height, left, i + 1);
        int right = arr[0];
        int sum = arr[1];
        if (right < height[i]) {
            right = height[i];
        }
        sum += mins(right, left) - height[i];
        int[] arr1 = { right, sum };
        return arr1;
    }

    int mins(int right, int left) {
        if (right < left)
            return right;
        else
            return left;
    }

}
