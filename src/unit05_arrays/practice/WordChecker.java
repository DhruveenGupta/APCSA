package unit05_arrays.practice;
// https://codehs.com/uploads/72cae93e65545119e182811b3eeb403b
import java.util.ArrayList;

public class WordChecker {
    private ArrayList<String> wordList;

    public boolean isWordChain(){
        try {
            if (wordList.size() <= 1){
                return false;
            }
        } catch (NullPointerException e){
            return false;
        }
        for (int i = 1; i <= wordList.size() - 1; i++){
            String word = wordList.get(i);
            String prev = wordList.get(i-1);
            if (!word.contains(prev)){
                return false;
            }
        }
        return true;
    }
    /*
    public ArrayList<String> createList(String target){
        int targetLength = target.length();
        ArrayList<String> result = new ArrayList<>();
        for (String word: wordList){
            String has = "";
            for (int i = 0; i <= word.length() - targetLength; i++){

            }
        }
    }
    */

    public static void main(String[] args) {
        WordChecker wc = new WordChecker();
        wc.wordList = new ArrayList<>();
        wc.wordList.add("to");
        //wc.wordList.add("t");
        //wc.wordList.add("stool");
        //wc.wordList.add("stools");
        boolean result = wc.isWordChain();
        System.out.println("Is the word list a word chain? " + result);
    }
}
