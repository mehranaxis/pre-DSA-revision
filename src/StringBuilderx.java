public class StringBuilderx {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Guddu bhai");
        System.out.println(str.charAt(2));
        System.out.println(str);


        str.setCharAt(0, 'P');
        System.out.println(str);

        str.append('n');
        System.out.println(str);

        
    }
}
