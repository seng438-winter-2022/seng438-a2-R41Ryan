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
 
# 3 Test cases developed
Range Class

getCentralValue() Method
centralValueMixedRange - Tests a range spanning from negative to positive 
centralValuePositiveRange - Tests a range with only positive values
centralValueNegativeRange - Tests a range with only negative values
centralValueZeroWidethRange - Tests a range with zero width where the upper boundary = lower boundary
centralValueLargeRange() - Tests a range with very large values for upper and lower boundaries

contains() Method: These tests unless specified all test a generic range with negative and positive values
containsValueInRange() - This test the equivalence class for a value contained in the specified range
containsValueLessThanRange() - This tests the equivalence class for all values less than the lower boundary of the specified range
containsValueGreaterThanRange() - This tests the equivalence class for all values greater than the upper boundary of the specified range 
containsValueIsUpperBound() - This tests the boundary case where the input is the same as the range upper boundary
containsValueIsLowerBound() - This tests the boundary case where the input is the same as the range lower boundary
containsValueIsUpperAndLowerBound - This tests a special case where the range is zero width and the input value is the same as the upper and lower range boundary

getLength() Method
getlengthMixedRange() - This tests a range spanning from negative to positive
getLengthNegativeRange() - This tests a range containing only negative values
getLengthPositiveRange() - This tests a range containing only positive values
getLengthZeroRange() - This tests a zero width range with upper boundary = lower boundary
getLengthLargeRange() - This tests a range with very large values for for the upper and lower boundary


# 4 How the team work/effort was divided and managed

We selected the 5 methods from org.jfree.data.Range that we wanted to test as a group, then divided the 10 methods between ourselves. Mathew created tests for three methods from org.jfree.data.Range (contains(), getCentralValue(), and getLength()). Mason created tests for the remaining two methods from org.jfree.data.Range (getUpperBound() and getLowerBound()). Ryan created tests for three methods from org.jfree.data.DataUtilities (calculateColumnTotal(), createNumberArray(), and getCumulativePercentages()). Jonas created tests for the remaining two methods from org.jfree.data.DataUtilities (calculateRowTotal() and equal()). After the tests were created, we met as a group to check each others work and provide feedback.

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
