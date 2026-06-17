public class TowerOfHanoi {
    static void hanoi(int n, String src, String hlpr, String dest){
        if (n==1){
            System.out.println("transfered "+n + " from " + src + " to "+ dest);
            return;
        }
        hanoi(n-1, src, dest, hlpr);
        System.out.println("transfered "+n + " from " + src + " to "+ dest);
        hanoi(n-1, hlpr, src, dest);
    }
    public static void main(String[] args) {
         int n = 3;
         hanoi(n, "Source", "helper", "destination");
    
    }
}