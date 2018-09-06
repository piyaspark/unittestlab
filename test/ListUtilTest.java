import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class ListUtilTest {

    @Before
    public void setUp() throws Exception{

    }

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

    @Test
    public void testEmptyList(){
        List<String> unique = new ArrayList<>();
        assertEquals(0,ListUtil.countUnique(unique));
    }

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

    @Test (expected=NullPointerException.class)
    public void testImpossibleCase(){
        List<String> unique2 = null;
        assertEquals(NullPointerException.class,ListUtil.countUnique(unique2));
    }

    @Test
    public void testHugeList(){
        List<Integer> unique2 = new ArrayList<>();
        unique2.add(1);
        unique2.add(2);
        unique2.add(3);
        unique2.add(1);
        unique2.add(4);
        unique2.add(1);
        unique2.add(2);
        unique2.add(5);
        unique2.add(1);
        unique2.add(4);
        unique2.add(1);
        unique2.add(2);
        unique2.add(3);
        unique2.add(6);
        unique2.add(4);
        assertEquals(6,ListUtil.countUnique(unique2));
    }

    @Test
    public void testBinarySearch(){
        String[] array = {"London", "Liverpool", "Manchester"};
        assertEquals(0,ListUtil.binarySearch(array,"London"));

    }

    @Test
    public void testMultipleElementInArray(){
        String[] array = {"London", "Liverpool", "Liverpool", "Manchester", "Liverpool"};
        assertEquals(1,ListUtil.binarySearch(array,"Liverpool"));
        assertNotEquals(2,ListUtil.binarySearch(array,"Liverpool"));
        assertNotEquals(4,ListUtil.binarySearch(array,"Liverpool"));
    }

    @Test
    public void testNoElementInArray(){
        String[] array = {"London", "Liverpool", "Liverpool", "Manchester", "Liverpool"};
        assertEquals(-1,ListUtil.binarySearch(array,"Amsterdam"));

    }
}
