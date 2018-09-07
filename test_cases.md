## Test cases for ListUtil

---

### Test cases for countUnique

* testCountUnique: test that the method can work collectly.

* testEmptyList: test that when list is empty the method will return 0 because there no unique element in that list.

* testListContainNullValue: test that null is element that can count as unique.

* testImpossibleCase: test the case that method can't run and it will throw an exception(NullPointerException) when the list is null.

* testHugeList: test that the method can work even the large size of list.

---

### Test cases for binarySearch

* testBinarySearch: Test that the binarySearch can work correctly.

* testDuplicateElementInArray: Test that the binarySearch can work only with arrays that have different element.

* testNoElementInArray: Test that when no element in the arrays, it will return -1.

* testThrowException: Test that when element is null, it will throw an exception.
