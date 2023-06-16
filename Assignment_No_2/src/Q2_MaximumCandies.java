
public class Q2_MaximumCandies {
    public static int maximumCandies(int[] candyType) {
        int n = candyType.length;
        int maximumCandies = n / 2; 
        boolean[] count = new boolean[200001];
        
        int unique = 0; 
        
        for (int candy : candyType) {
            if (!count[candy]) {
                count[candy] = true;
                unique++;
                
                if (unique == maximumCandies) {
                    break; 
                }
            }
        }
        
        return unique;
    }
    
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int result = maximumCandies(candyType);
        System.out.println("Result: " + result);
    }
}

