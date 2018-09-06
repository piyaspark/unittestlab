import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
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

//    @Test
//    public void testBinarySearch(){
//        String[] array = {"London", "Liverpool", "Manchester"};
//        assertEquals(0,ListUtil.binarySearch(array,"London"));
//
//    }
//
//    @Test
//    public void testMultipleElementInArray(){
//        String[] array = {"London", "Liverpool", "Liverpool", "Manchester", "Liverpool"};
//        assertEquals(1,ListUtil.binarySearch(array,"Liverpool"));
//        assertNotEquals(2,ListUtil.binarySearch(array,"Liverpool"));
//        assertNotEquals(4,ListUtil.binarySearch(array,"Liverpool"));
//    }
//
//    @Test
//    public void testNoElementInArray(){
//        String[] array = {"London", "Liverpool", "Liverpool", "Manchester", "Liverpool"};
//        assertEquals(-1,ListUtil.binarySearch(array,"Amsterdam"));
//
//    }
}
