import java.util.*;

/**
 * Class for list utility method.
 *
 * @author Piyaphol Wiengperm 6010545846
 */
public class ListUtil {

    /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list){
        Set<?> unique = new HashSet<>(list);
        return unique.size();
    }

    /**
     * This method is efficient way to find the index of element. with binary search,
     * the time taken by the search results naturally increases with the size of the dataset, but not proportionately.
     * @param array is sorted array.
     * @param element is key element.
     * @param <T> is type parameter.
     * @return index of element.
     */
    public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element) {
        if (element == null) throw new IllegalArgumentException("Search element must not be null");

        int low = 0;
        int high = array.length - 1;
        int index = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid].compareTo(element) < 0) {
                low = mid + 1;
            } else if (array[mid].compareTo(element) > 0) {
                high = mid - 1;
            } else if (array[mid].compareTo(element) == 0) {
                index = mid;
                break;
            }
        }
        if (index == Integer.MAX_VALUE)return -1;

        return index;
    }
}