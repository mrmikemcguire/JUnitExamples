import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitExamplesTest
	{
	@Test
	public void testGreetUser()
		{
		String name = "Fred";
		assertEquals("Hi, Fred!", JUnitExamples.greetUser());
		}
	}
