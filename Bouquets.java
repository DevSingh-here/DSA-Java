class Solution {
    private boolean possible(int[] nums, int mid, int m, int k) {
        int n = nums.length;
        int cnt = 0;
        int noofb = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= mid) {
                cnt++;
            } else {
                noofb += cnt / k;
                cnt = 0;
            }
        }
        noofb += cnt / k;
        return noofb >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long) m * k;
        if (val > n)
            return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int low = min, high = max, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}