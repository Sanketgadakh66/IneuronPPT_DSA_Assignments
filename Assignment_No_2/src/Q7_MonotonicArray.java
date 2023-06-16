public class Q7_MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increase = false;
            }
            
            if (nums[i] > nums[i - 1]) {
                decrease = false;
            }
        }
        
        return increase || decrease;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        boolean result = isMonotonic(nums);
        System.out.println("Result: " + result);
    }
}
