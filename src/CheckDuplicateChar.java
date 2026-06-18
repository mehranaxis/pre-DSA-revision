public class CheckDuplicateChar {
    public static boolean[] map = new boolean[26];
    static void removeDuplicate(String str, int index, String newStr){
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if(!map[currChar - 'a']){
            newStr = newStr + currChar;
            map[currChar - 'a'] = true;
        }
        removeDuplicate(str, index+1, newStr);
    }
    public static void main(String[] args) {
        String str = "aahdqhhsnnxzishsaa";
        String newStr = "";
        removeDuplicate(str, 0, newStr);
        System.out.println(newStr);
    }
}
