import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class for list utility method.
 *
 * @author Piyaphol Wiengperm 6010545846
 */
public class ListUtil {

    /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * TODO: can the list contain null values? Does null count as a unique element?
     *
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list){
        Set<?> unique = new HashSet<>(list);
        return unique.size();
    }

//    /**
//     *
//     * @param array
//     * @param element
//     * @param <T>
//     * @return
//     */
//    public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element){
//        if(element == null)throw new IllegalArgumentException("Search element must not be null");
//        for(int i = 0;i<array.length;i++){
//            if(array[i] == element){
//                return i;
//            }
//        }
//        return -1;
//    }
}