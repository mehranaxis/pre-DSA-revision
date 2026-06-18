public class SortedArray {
    static boolean isSorted(int[] arr, int i, int j, boolean ans){
        if (arr.length == j){
            return ans;
        }
       
        if (arr[j]> arr[i]){
            ans = true;
        }
        else{
            ans = false;
            return false;
        }
         return isSorted(arr, i+1, j+1, ans);
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 12, 34};
        System.out.println(isSorted(arr, 0, 1, false));

    }
}
