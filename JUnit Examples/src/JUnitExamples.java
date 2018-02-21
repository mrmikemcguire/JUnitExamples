import java.util.Scanner;

public class JUnitExamples
	{

	public static void main(String[] args)
		{
		greetUser();
		flipCoin();
		}
	
	public static String greetUser()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
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
