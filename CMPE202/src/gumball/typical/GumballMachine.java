package gumball.typical;

public class GumballMachine
{

	private int num_gumballs;
	private static int _QUARTER = 25;
	int cost = 0;
	boolean quarterOnly = false;
	int currentCoins = 0;


	public GumballMachine( int size, int cost, boolean quarterOnly )
	{
		// initialise instance variables
		this.num_gumballs = size;
		this.cost = cost;
		this.quarterOnly = quarterOnly;
	}

	public void insertCoins(int coin)
	{
		if(this.currentCoins >= cost)
		{
			System.out.println("You can't insert more coins");
			return;
		}

		if(this.quarterOnly && coin!=_QUARTER)
		{
			System.out.println("You can only insert a quarter");
			return;
		}

		this.currentCoins += coin;
	}

	public void turnCrank()
	{
		if ( this.currentCoins >= this.cost )
		{
			if ( this.num_gumballs > 0 )
			{
				this.num_gumballs-- ;
				this.currentCoins = 0 ;
				System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
			}
			else
			{
				System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
			}
		}
		else
		{
			System.out.println( "Please insert coins" ) ;
		}
	}
}
