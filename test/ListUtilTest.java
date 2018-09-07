import org.junit.*;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


/**
 * Test cases for ListUtil.
 *
 * @author Piyaphol Wiengperm 6010545846
 */
public class ListUtilTest {

    @Before
    public void setUp() throws Exception{

    }

    /**
     * Test that the method can work collectly.
     */
    @Test
    public void testCountUnique(){
        List<String> unique = new ArrayList<>();
        unique.add("a");
        unique.add("b");
        unique.add("c");
        unique.add("a");
        assertEquals(3,ListUtil.countUnique(unique));

        unique.clear();
        unique.add("a");
        unique.add("a");
        unique.add("a");
        unique.add("a");
        assertEquals(1,ListUtil.countUnique(unique));

        List<Integer> unique2 = new ArrayList<>();
        unique2.add(1);
        unique2.add(2);
        unique2.add(3);
        unique2.add(1);
        unique2.add(4);
        assertEquals(4,ListUtil.countUnique(unique2));

    }

    /**
     * Test that when list is empty the method will return 0 because there no unique element in that list.
     */
    @Test
    public void testEmptyList(){
        List<String> unique = new ArrayList<>();
        assertEquals(0,ListUtil.countUnique(unique));
    }

    /**
     * Test that null is element that can count as unique.
     */
    @Test
    public void testListContainNullValue(){
        List<String> unique = new ArrayList<>();
        unique.add("a");
        unique.add("b");
        unique.add("c");
        unique.add(null);
        assertEquals(4,ListUtil.countUnique(unique));

        unique.clear();
        unique.add(null);
        unique.add(null);
        unique.add(null);
        assertEquals(1,ListUtil.countUnique(unique));
    }

    /**
     * Test the case that method can't run and it will throw an exception(NullPointerException) when the list is null.
     */
    @Test (expected=NullPointerException.class)
    public void testImpossibleCase(){
        List<String> unique2 = null;
        assertEquals(NullPointerException.class,ListUtil.countUnique(unique2));
    }

    /**
     * Test that the method can work even the large size of list.
     */
    @Test
    public void testHugeList(){
        List<Integer> unique2 = new ArrayList<>();
        Random random = new Random();

        int number;
        for(int i = 0;i<1000000;i++){
            number = random.nextInt(10) + 1;
            unique2.add(number);
        }

        assertEquals(10,ListUtil.countUnique(unique2));
    }


    /**
     * Test that the binarySearch can work correctly.
     */
    @Test
    public void testBinarySearch(){
        String[] array = {"London", "Liverpool", "Manchester"};
        Arrays.sort(array);
        assertEquals(Arrays.binarySearch(array,"Liverpool"),ListUtil.binarySearch(array,"Liverpool"));

        String[] array2 = {"A","C","D","B"};
        Arrays.sort(array2);
        assertEquals(Arrays.binarySearch(array2,"D"),ListUtil.binarySearch(array2,"D"));

        Integer[] array3 = {6,2,4,1};
        Arrays.sort(array3);
        assertEquals(Arrays.binarySearch(array3,1),ListUtil.binarySearch(array3,1));
    }

    /**
     * Test that the binarySearch can work with arrays that have different element.
     */
    @Test (expected = AssertionError.class)
    public void testDuplicateElementInArray(){
        String[] array = {"London", "Liverpool", "Liverpool", "Manchester", "Liverpool"};
        assertEquals(AssertionError.class,ListUtil.binarySearch(array,"Liverpool"));

    }

    /**
     * Test that when no element in the arrays, it will return -1.
     */
    @Test
    public void testNoElementInArray(){
        String[] array = {"London", "Liverpool", "Liverpool", "Manchester", "Liverpool"};
        assertEquals(Arrays.binarySearch(array,"Amsterdam"),ListUtil.binarySearch(array,"Amsterdam"));

    }

    /**
     * Test that when element is null, it will throw an exception.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testThrowException(){
        String[] array = {"London", "Liverpool", "Manchester"};
        assertEquals(IllegalArgumentException.class,ListUtil.binarySearch(array,null));
    }
}
