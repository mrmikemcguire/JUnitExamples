import static org.junit.Assert.*;

import org.junit.Test;

public class AddingNumbersTest2
	{

		@Test
		public void testAddTwoNumbers()
			{
				assertEquals(5, AddingNumbers.addTwoNumbers(2, 3));
				//fail("Not yet implemented");
			}
		
		@Test
		public void addTwoNumbersTest()
			{
			assertEquals(7, AddingNumbers.addTwoNumbers(3,4));
			assertEquals(-3, AddingNumbers.addTwoNumbers(-5,2));
			}

	}
