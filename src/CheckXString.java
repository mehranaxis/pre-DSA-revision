public class CheckXString {
    static void removeX(String str, int index, int count,String newStr ){
        if(str.length() == index){
            for (int i = 0; i < count; i++) {
                newStr = newStr + 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar= str.charAt(index);
        if (currChar == 'x' || currChar == 'X') {
            count++;
            removeX(str, index+1, count, newStr);
        }
        else{
            newStr = newStr + currChar;
            removeX(str, index+1, count, newStr);
        }
        
    }
    public static void main(String[] args) {
        String str = "yoxcasioxbhaxoxox";
        String newStr = "";
        removeX(str, 0, 0, newStr);
    }
}
