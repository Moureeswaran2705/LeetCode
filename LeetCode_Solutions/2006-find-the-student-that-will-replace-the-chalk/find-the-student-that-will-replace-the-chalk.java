class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sum = 0;
        int n = chalk.length;
        for(int i = 0; i < n; i++) {
            sum += chalk[i];
            if(sum > k) return i;
        }
        return chalkReplacer(chalk, k % sum);
    }
}