package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class CountingCharactersBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote to count its characters: ");
        String quote = input.nextLine();

        char [] charArray = quote.toLowerCase().toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char letter : charArray) {
            if (counts.containsKey(letter)) {
                counts.put(letter, counts.get(letter) + 1);
            } else {
                counts.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ":" + count.getValue());
        }


    }
}
