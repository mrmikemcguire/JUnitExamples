
public class Batter
	{
	private int atBats;
	private int hits;
	
	public Batter(int ab, int h)
		{
		atBats = ab;
		hits = h;
		}

	public int getAtBats()
		{
		return atBats;
		}

	public void setAtBats(int atBats)
		{
		this.atBats = atBats;
		}

	public int getHits()
		{
		return hits;
		}

	public void setHits(int hits)
		{
		this.hits = hits;
		}

	@Override
	public String toString()
		{
		return "Batter [atBats: " + atBats + "  hits: " + hits + "]";
		}
	
	public double calculateBattingAverage()
		{
		double battingAverage = (double) hits / (double) atBats;
		return battingAverage;
		}
	}
	
	
	
