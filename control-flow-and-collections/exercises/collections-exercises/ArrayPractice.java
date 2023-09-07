import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};

        for (int i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        String lines = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = lines.split(" ");
        System.out.println(Arrays.toString(words));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentences = lines.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}

