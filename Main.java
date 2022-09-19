import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] newString = wordsThatHaveLessThanFiveLetters("You can write this function");
        System.out.println(Arrays.toString(newString));

    }

    public static String[] wordsThatHaveLessThanFiveLetters(String s) {
        String[] arrayOfWords = s.split(" ");
        List<String> listOfWords = new ArrayList<>(Arrays.asList(arrayOfWords));

        for(String word : arrayOfWords) {
            if (word.length() >= 5) {
                listOfWords.remove(word);
            }
        }
        return listOfWords.toArray(new String[0]);
    }

}