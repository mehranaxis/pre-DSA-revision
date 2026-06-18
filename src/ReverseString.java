public class ReverseString {
    static void reverseStr(String str, int index){
        if (index == 0){
            System.out.println(str.charAt(0));
            return;
        }
        System.out.println(str.charAt(index));
        reverseStr(str, index-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverseStr(str, str.length()-1);
    }
}
