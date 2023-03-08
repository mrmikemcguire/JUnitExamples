import java.util.Scanner;

public class JUnitExamples
	{
	static String name;
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		name = userInput.nextLine();
		System.out.println(greetUser(name));
		flipCoin();
		}
	
	public static String greetUser(String name)
		{
		return("Hello, " + name + "!");
		}
	
	public static void flipCoin()
		{
		int coinFlip = (int) (Math.random() * 2);
		if(coinFlip == 0)
			{
			System.out.println("heads");
			}
		if(coinFlip == 1)
			{
			System.out.println("tails");
			}
		}
	}
