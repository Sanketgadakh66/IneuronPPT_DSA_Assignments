public class Q8_MinScore {
    public static int minScore(int[] nums, int k) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
        
        int diff = maxNum - minNum;
        
        if (diff <= 2 * k) {
            return 0;
        } else {
            return diff - 2 * k;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int result = minScore(nums, k);
        System.out.println("Result: " + result);
    }
}
