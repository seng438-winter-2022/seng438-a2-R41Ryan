**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  34   |
| -------------- | --- |
| Student Names: |Mason Harris   |
|                |Ryan Huynh  |
|                |Mathew Pelletier  |
|                |Jonas Wong|

# 1 Introduction

Text…

# 2 Detailed description of unit test strategy

For the test cases developed for the range methods, many do not take any inputs directly and instead depend on the variables used to create the range class itself.
For these cases we tested various ranges using partions based around the positive and negative values for range boundaries, 
for example a range spanning from negative to positive, fully contained in the negative side, or fully contained in the positive side.
Additionally a special case for a scenario where the lower boundary was the same as the upper boundary to create a zero width range.

For other cases where an input variable was tests were designed to cover all of the possible equivalence classes for a generic example range spanning from negative to positive values.
For range this would generally include cases above and below the given range as well as those within it. Additionally boundary values for the actual range limits are tested as input values.

For the test cases for the DataUtilities methods, the general strategy was to identify equivalence classes for the various inputs and testing the variables within those equivalence classes and, if applicable, testing boundary values. For example, some methods have a variable that refers to an index in a collection, thus we test for when the index is out of bounds. Almost all of the tests for DataUtilities methods are done using integers and doubles as that is what those methods are meant to be used for.
 
# 3 Test cases developed
### Range Class

getCentralValue() Method  
* centralValueMixedRange - Tests a range spanning from negative to positive   
* centralValuePositiveRange - Tests a range with only positive values  
* centralValueNegativeRange - Tests a range with only negative values  
* centralValueZeroWidethRange - Tests a range with zero width where the upper boundary = lower boundary  
* centralValueLargeRange() - Tests a range with very large values for upper and lower boundaries  
* centralValueNonIntRange() - Test a a range with non integer boundaries to ensure the returned central value is correct  

contains() Method: These tests unless specified all test a generic range with negative and positive values  
* containsValueInRange() - This test the equivalence class for a value contained in the specified range  
* containsValueLessThanRange() - This tests the equivalence class for all values less than the lower boundary of the specified range  
* containsValueGreaterThanRange() - This tests the equivalence class for all values greater than the upper boundary of the specified range   
* containsValueIsUpperBound() - This tests the boundary case where the input is the same as the range upper boundary  
* containsValueIsLowerBound() - This tests the boundary case where the input is the same as the range lower boundary  
* containsValueIsUpperAndLowerBound - This tests a special case where the range is zero width and the input value is the same as the upper and lower range boundary  

getLength() Method
* getlengthMixedRange() - This tests a range spanning from negative to positive  
* getLengthNegativeRange() - This tests a range containing only negative values    
* getLengthPositiveRange() - This tests a range containing only positive values  
* getLengthZeroRange() - This tests a zero width range with upper boundary = lower boundary  
* getLengthLargeRange() - This tests a range with very large values for for the upper and lower boundary  
* getLengthNonIntRange() - This tests a range with non integer boundaries to ensure the returned length is correct  

### DataUtilities Class

calculateColumnTotal() Method:
* testBasicCalculateColumnTotal() - This is just a basic test with positive values to see if it works as intended using column 0
* testCalculateColumnTotalWithNull() - This tests to see if null values are ignored when calculating the total by adding a single null value in a column.
* testCalculateColumnTotalWithAllNulls() - This tests to see if null values are ignored when calculating the total by having an entire column null
* testCalculateColumnTotalWithNoRows() - This tests to see if the calculated value is 0 when there are no rows.
* testCalculateColumnTotalOutOfBoundsNegative() - This tests to see if an IndexOutOfBoundsException is thrown when entering the column -1
* testCalculateColumnTotalOutOfBoundsPositive() - This tests to see if an IndexOutOfBoundsException is thrown when entering a column greater than the maximum index allows (in this case, column 2)
* testCalculateColumnTotalPositiveBound() - This tests to see if the method still works as intended when selecting the positive bound (in this case, column 1)
* testCalculateColumnTotalPositiveBound() - This tests to see if the valid rows method is working as intended.

createNumberArray() Method:
* testCreateNumberArrayPositiveValues() - This tests the method using positive integers and decimals
* testCreateNumberArrayNegativeValues() - This tests the method using negative integers and decimals

getCumulativePercentages() Method:
* testGetCumulativePercentagesPositiveIntegers() - This tests the method using only positive integers
* testGetCumulativePercentagesDoubles() - This tests the method using doubles
* testGetCumulativePercentagesNegativeIntegers() - This tests the methods to see if it still works as intended with a negative integer.

# 4 How the team work/effort was divided and managed

We selected the 5 methods from org.jfree.data.Range that we wanted to test as a group, then divided the 10 methods between ourselves. Mathew created tests for three methods from org.jfree.data.Range (contains(), getCentralValue(), and getLength()). Mason created tests for the remaining two methods from org.jfree.data.Range (getUpperBound() and getLowerBound()). Ryan created tests for three methods from org.jfree.data.DataUtilities (calculateColumnTotal(), createNumberArray(), and getCumulativePercentages()). Jonas created tests for the remaining two methods from org.jfree.data.DataUtilities (calculateRowTotal() and equal()). After the tests were created, we met as a group to check each others work and provide feedback.

# 5 Difficulties encountered, challenges overcome, and lessons learned

Most of the team has already previously used Junit and done testing before so the lab was not too difficult. Doing the testing with equivalence class testing and boundary value testing in mind was helpful in identifying the best tests to implement and allowed us to find certain tests that would not have been thought of previously. Initially figuring out how the mocking worked was difficult but with a little practice, it became easier. Finding a good time to have meetings was again a little bit difficult but with compromises, we were all able to meet together multiple times and worked well together.  

# 6 Comments/feedback on the lab itself
There were a few difficulties with this lab. Firstly, hamcrest-all was needed in order to do the mocking for the tests which was not initially provided which caused some confusion, having all external jar files would have allowed for less frustrations during the lab. Secondly, the execution environment JRE was version 8 but eclipse shows version 8 as 1.8 which was not explained very clearly again causing some confusion. Other than those points, the lab was well written and having the jmock example was extremely helpful to help have a more solid idea of how to do mocking.
