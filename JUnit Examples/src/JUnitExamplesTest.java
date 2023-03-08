import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitExamplesTest
	{
	@Test
	public void testGreetUser()
		{
		assertEquals("Hello, Fred!", JUnitExamples.greetUser("Fred"));
		assertEquals("Hello, !", JUnitExamples.greetUser(""));
		}
	}
