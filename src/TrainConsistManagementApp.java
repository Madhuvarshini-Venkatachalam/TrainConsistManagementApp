import java.util.Arrays;

public class UC19BinarySearch {

    public static int binarySearch(String[] bogies, String target) {
        int left = 0, right = bogies.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = bogies[mid].compareTo(target);

            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] bogies = {"BG101", "BG102", "BG103", "BG104"};
        Arrays.sort(bogies); // must be sorted

        String target = "BG103";

        int result = binarySearch(bogies, target);

        if (result != -1)
            System.out.println("Bogie Found at index: " + result);
        else
            System.out.println("Bogie Not Found");
    }
}