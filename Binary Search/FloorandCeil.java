class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int[] ans = { -1, -1 };
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                ans[1] = nums[mid];
                high = mid - 1;
            } else if (nums[mid] < x) {
                ans[0] = nums[mid];
                low = mid + 1;
            } else {
                ans[0] = nums[mid];
                ans[1] = nums[mid];
                break;
            }
        }
        return ans;
    }
}