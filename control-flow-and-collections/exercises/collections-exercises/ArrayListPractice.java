import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add 10 integers to the ArrayList
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        // Print the ArrayList
        System.out.println(arrayList);
    }
}

