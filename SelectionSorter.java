import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSorter {

    // selection sort method
    // It sorts an ArrayList using the comparator
    public static <T> void selectionSort(ArrayList<T> list, Comparator<T> comp) {

        int n = list.size(); // total number of elements

        // Move through each position in the list
        for (int i = 0; i < n - 1; i++) {

  
            int minIndex = i;

            // Check the rest of the list for a smaller element
            for (int j = i + 1; j < n; j++) {
                if (comp.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap elements if a smaller value was found
            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
