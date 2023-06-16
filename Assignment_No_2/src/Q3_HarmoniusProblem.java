
public class Q3_HarmoniusProblem {
    public static int find(int[] nums) {
        int max = 0;
        int[] count = new int[200001]; 
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] > 0 && count[i + 1] > 0) {
                int len = count[i] + count[i + 1];
                max = Math.max(max, len);
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = find(nums);
        System.out.println("Result: " + result);
    }
}
