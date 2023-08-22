package org.launchcode;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
;        String lyrics = "alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing" +
                " to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought alice ‘without pictures " +
                "or conversation?’ " +
                "\n";

    System.out.println("Enter a word to search for in the lyrics: ");
    String searchTerm = input.nextLine().toLowerCase();

    if (lyrics.contains(searchTerm)) {
        System.out.println(searchTerm + " was found");
        int index = lyrics.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = lyrics.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    } else {
        System.out.println(searchTerm + " was not found");
    }

    }
}
