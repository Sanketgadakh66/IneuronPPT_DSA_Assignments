public class Q4_PlaceFlowers {
    public static boolean PlaceFlowers(int[] flower, int n) {
        int count = 0; 
        
        int length = flower.length;
        int i = 0;
        
        while (i < length) {
            if (flower[i] == 0 && (i == 0 || flower[i - 1] == 0) && (i == length - 1 || flower[i + 1] == 0)) {
                flower[i] = 1; 
                count++; 
                
                if (count >= n) {
                    return true; 
                }
            }
            
            i++;
        }
        
        return false; 
    }
    
    public static void main(String[] args) {
        int[] flower = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = PlaceFlowers(flower, n);
        System.out.println("Result: " + result);
    }
}
