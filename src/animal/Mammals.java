package animal;

public class Mammals extends AbstractAnimal
{
	// Fields

	//Constructor

	public Mammals(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public String move()
	{
		return "Walk";
	}

	@Override
	public String breathe()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Live Births";
	}
}

