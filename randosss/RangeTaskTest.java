import unittest

import static org.junit.jupiter.api.Assertions.*;

public class RangeTaskTest

@Test
public void testThattheRangereturnsCorrectValues(){
int [] numbers = {2,3,7,9,20};
expectedOutput = 18;
int exactOutput = RangeTask.RangeOf(numbers);
assertEquals(expectedOutput, exactOutput);


@Test
public void 
