# Lab08
Lab08 Group work repo

2, 3, 7, 10, 12, 14, 26

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