import static org.junit.Assert.*;
import org.junit.Test;

public class BatterTest
	{
	@Test
	public void testBatter()
		{
		Batter b = new Batter(300, 100);
		b.setAtBats(400);
		assertEquals(400, b.getAtBats());
		b.setHits(187);
		assertEquals(187, b.getHits());
		}
	
	@Test
	public void testToString()
	    {
        Batter b = new Batter(250, 75);
        String expected = "Batter [atBats: " + 250 + "  hits: " + 75 + "]";
        assertEquals(expected, b.toString());
	    }
	
	@Test
	public void testCalculateBattingAverage()
		{
		Batter b = new Batter(1000, 247);
		assertTrue(b.calculateBattingAverage() == 0.247);
		}

	}
