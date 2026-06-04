public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i<= n; i++){
            int x = 1;
            for (int j = n; j >= i; j--){
                
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}