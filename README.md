# Lab08

Lab08 Group work repo

2, 3, 7, 10, 12, 14, 26

## TODO

- [ ] 2 == [ ] -> addToFront(A) -> [A]
- [ ] 3 == [ ] -> addToRear(A) -> [A]
- [ ] 7 == [A] -> addToRear(B) -> [A,B]
- [ ] 10 == [ ] -> add(0,B) -> [B,A]
- [ ] 12 == [A] -> removeFirst() -> []
- [ ] 14 == [A] -> remove(A) -> []
- [ ] 26 == [A,B] -> removeLast() -> [A]

## Quick Reference

- testTwoElementList() method
  - https://github.com/yycholla/Lab08/blob/af9f26eeeccbb17e0e2f891ccdb2a3eb65483db4/ListTester.java#L686
-

• Ensure tests evaluate list behavior correctly, when transitioning between different lists sizes
• Use consistent naming conventions like

    StartingState_Change_ResultingState

    Example: Scenario 6, which begins with list [A] and contains [B,A]
        after addToFront(B), is identified as A_addToFrontB_BA.

    Test Methods should being with the scnario name followed by its method

    Example: the test for size() after scenario 6 is named A_addToFrontB_BA_testSize

Tests two implementations of IndexUnsortedList:
• GoodList.java
Correctly implemented list that passes all tests except iterator concurrency tests
Uses Java's LinkedList but doesn't throw ConcurrentModificationException as expected

    Should pass ALL IndexedUnsortedList tests (except iterator concurrency)

• BadList.java
Stub implmentation that should fail most tests
Serves as an example of why multiple tests are needed to verify correctness

    Should FAIL mosts tests

You will need to complete the set of tests for scenarios
resulting in a two-element list
