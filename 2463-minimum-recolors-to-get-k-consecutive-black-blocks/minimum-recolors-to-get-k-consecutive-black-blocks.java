class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i = 0;
        int j = k - 1;

        int res = Integer.MAX_VALUE;

        while (j < blocks.length()) {
            int cnt = 0;   // reset for each window

            for (int z = i; z <= j; z++) {
                if (blocks.charAt(z) == 'W') {
                    cnt++;
                }
            }

            res = Math.min(res, cnt);
            i++;
            j++;
        }

        return res;
    }
}
