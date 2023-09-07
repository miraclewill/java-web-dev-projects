import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordPrinter {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("grape");
        wordList.add("kiwi");
        wordList.add("orange");
        wordList.add("lemon");

        printWordsWithFiveLetters(wordList);
    }

    public static void printWordsWithFiveLetters(List<String> words) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word length: ");
        int userNum = input.nextInt();
        for (String word : words) {
            if (word.length() == userNum) {
                System.out.println(word);
            }
        }
    }
}
