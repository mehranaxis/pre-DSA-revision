public class StringOccurance {
    static void strOccur(String str,char element,  int first, int last, int index){
        if (index == str.length()){
            System.out.println("first is "+ first + "last is "+ last);
            return;
        }
        
        if(str.charAt(index) == element){
            if (first == -1) {
                first = index;
            }
            else{
                last = index;
            }
        }
        strOccur(str, element, first, last, index+1);
    }
    public static void main(String[] args) {
        String str = "aalukhanputato";
        strOccur(str, 'a', -1, -1, 0);
    }
}
