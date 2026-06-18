public class Subcequence {
    static void printSub(String str, int index, String newStr ){
        if (index == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        // to be
        printSub(str, index+1, newStr + currChar);
        // not to be
        printSub(str, index+1, newStr);
    }
    public static void main(String[] args) {
        printSub("abc", 0, "");
    }
}
