import static org.junit.Assert.*;
import org.junit.Test;

public class AddingNumbersTest
	{

		@Test
		//This only works with Junit5:  @DisplayName("Test of basic addition")
		public void addTwoNumbersTest()
			{
			assertEquals(7, AddingNumbers.addTwoNumbers(3,4));
			assertEquals(-3, AddingNumbers.addTwoNumbers(-5,2));
			}

	}
