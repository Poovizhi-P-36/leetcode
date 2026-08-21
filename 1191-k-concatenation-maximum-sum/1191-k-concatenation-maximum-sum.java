class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long currmax = 0;
        long max = 0;
        long total = 0;
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        int repeat = Math.min(k, 2);
        for(int rep = 0; rep < repeat; rep++) {
            for(int i = 0; i < arr.length; i++) {
                currmax = Math.max(arr[i], currmax + arr[i]);
                max = Math.max(max, currmax);
            }
        }
        if(k > 2 && total > 0) {
            max = max + (k - 2) * total;
        }
        return (int)(max % 1000000007);
    }
}