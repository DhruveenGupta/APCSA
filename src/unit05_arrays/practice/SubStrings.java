package unit05_arrays.practice;

public class SubStrings {
    String str1 = "Hello World";
    String str2 = "llo W";

    // return true if str2 is a substring of str1, false otherwise
    public boolean isSubstring(){
        if(str1.contains(str2)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        SubStrings sub = new SubStrings();
        boolean result = sub.isSubstring();
        System.out.println("Is '" + sub.str2 + "' a substring of '" + sub.str1 + "'? " + result);
    }
}
