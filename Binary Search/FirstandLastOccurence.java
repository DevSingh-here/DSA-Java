class Solution {
    private int firstoccurence(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int fo = -1;
        while (low <= high) {
            int mid = low + high - low / 2;
            if (nums[mid] == target) {
                fo = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return fo;
    }

    private int secoccurence(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int lo = -1;
        while (low <= high) {
            int mid = low + high - low / 2;
            if (nums[mid] == target) {
                lo = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return lo;
    }

    public int[] searchRange(int[] nums, int target) {
        int fo = firstoccurence(nums, target);
        if (fo == -1)
            return new int[] { -1, -1 };
        int lo = secoccurence(nums, target);
        return new int[] { fo, lo };
    }
}